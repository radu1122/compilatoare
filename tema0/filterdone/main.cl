class Main inherits IO {
    lists : List <- new List;
	stringTokenizer : StringTokenizer <- new StringTokenizer;
    -- 0 = wait for input, 1 = taking input
    currentAction : Int;

	getListElement(inStr : String) : Object {
		let tokenizer: StringTokenizer <- new StringTokenizer.init(inStr),
			token: String <- tokenizer.nextToken()
		in {
			if token = new Soda.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: Int <- new A2I.a2i(tokenizer.nextToken())
				in {
					new Soda.init(name, model, price);
				}
			else if token = new Coffee.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: Int <- new A2I.a2i(tokenizer.nextToken())
				in {
					new Coffee.init(name, model, price);
				}
			else if token = new Laptop.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: Int <- new A2I.a2i(tokenizer.nextToken())
				in {
					new Laptop.init(name, model, price);
				}
			else if token = new Router.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: Int <- new A2I.a2i(tokenizer.nextToken())
				in {
					new Router.init(name, model, price);
				}
			else if token = new Private.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Private.init(name);
				}
			else if token = new Corporal.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Corporal.init(name);			
				}
			else if token = new Sergent.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Sergent.init(name);
				}
			else if token = new Officer.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Officer.init(name);
				}
			else if token = new IO.type_name() then
				new IO
			else if token = new Object.type_name() then
				new Object
			else if token = new Int.type_name() then
				new A2I.a2i(tokenizer.nextToken())
			else if token = new Bool.type_name() then
				let value: String <- tokenizer.nextToken() in
					if value = "true" then
						true
					else if value = "false" then
						false
					else
						abort()
					fi fi
			else if token = new String.type_name() then
				let value: String <- tokenizer.nextToken() in
					if value = "" then
						abort()
					else
						value
					fi
			else 
				abort()
			fi fi fi fi fi fi fi fi fi fi fi fi fi;
		}
	};

    main(): Object {
		let currentAction: Int <- 0,
		inStr: String <- "",
		tokenizer: StringTokenizer
		in {
			currentAction <- 1;
			let newList : List <- new List
			in {
				while currentAction = 1 loop {
					inStr <- in_string();
					if inStr = "END" then
						currentAction <- 0
					else
						newList.add(getListElement(inStr))
					fi;
				} pool;
				lists.add(newList);
				currentAction <- 0;
			};
			while true loop {
				inStr <- in_string();
				tokenizer <- new StringTokenizer.init(inStr);
				let token: String <- tokenizer.nextToken()
				in {
					if inStr = "help" then {
						out_string("Available commands: load, print, merge, filterBy, sortBy");
					} else if inStr = "load" then {
						currentAction <- 1;
						let newList : List <- new List
						in {
							while currentAction = 1 loop {
								inStr <- in_string();
								if inStr = "END" then
									currentAction <- 0
								else
									newList.add(getListElement(inStr))
								fi;
							} pool;
							lists.add(newList);
							currentAction <- 0;
						};
					} else if "print" = token then {
						let listIndex: Int,
							z : A2I <- new A2I,
							list: List
						in {
							if inStr.length() = 5 then {
								listIndex <- ~1;
							} else {
								listIndex <- z.a2i(inStr.substr(6, inStr.length() - 6)) - 1;
							}
							fi;
							if listIndex = ~1 then {
								let i: Int <- 0
								in {
									while i < lists.size() loop {
										case lists.get(i) of
											x : List => out_string(z.i2a(i + 1).concat(": [ ").concat(x.toString()).concat(" ]\n"));
											x : Object => abort();
										esac;
										
										i <- i + 1;
									} pool;
								};
							} else {
								case lists.get(listIndex) of
									x : List => list <- x;
									x : Object => abort();
								esac;
								out_string("[ ".concat(list.toString()).concat(" ]\n"));
							} fi;
							
						};
					} else if "merge" = token then {
						let listIndex1: Int <- new A2I.a2i(tokenizer.nextToken()) - 1,
							listIndex2: Int <- new A2I.a2i(tokenizer.nextToken()) - 1,
							list1: List,
							list2: List
						in {
							case lists.get(listIndex1) of
								x : List => list1 <- x;
								x : Object => abort();
							esac;
							case lists.get(listIndex2) of
								x : List => list2 <- x;
								x : Object => abort();
							esac;
							lists.add(list1.merge(list1, list2));
							lists.deleteElem(listIndex2);
							lists.deleteElem(listIndex1);
						};
					} else if "filterBy" = token then {
						let listIndex: Int <- new A2I.a2i(tokenizer.nextToken()) - 1,
							filterType: String <- tokenizer.nextToken(),
							filter: Filter,
							list: List,
							filtered: List
						in {
							if filterType = "ProductFilter" then
								filter <- new ProductFilter
							else if filterType = "RankFilter" then
								filter <- new RankFilter
							else if filterType = "SamePriceFilter" then
								filter <- new SamePriceFilter
							else
								abort()
							fi fi fi;

							case lists.get(listIndex) of
								x : List => list <- x;
								x : Object => abort();
							esac;

							filtered <- list.filterBy(filter);
							lists.replaceAtIndex(listIndex, filtered);
						};
					} else {
						self;
						-- out_string("Invalid command");
					} fi fi fi fi fi;
				};
			} pool;
		}
    };
};