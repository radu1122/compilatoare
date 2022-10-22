class Main inherits IO{
    lists : List <- new List;
    looping : Bool <- true;
    somestr : String;
	stringTokenizer : StringTokenizer <- new StringTokenizer;
    -- 0 = wait for input, 1 = taking input
    currentAction : Int;
    stateListen(): String { "listen" };
	stateAction(): String { "action" };
	actionFilter(): String { "filterBy" };
	actionSort(): String { "sortBy" };
	actionMerge(): String { "merge" };

	actionPrint(): String { "print" };

	typeInt(): String { "Int" };
	typeString(): String { "String" };
	typeBool(): String { "Bool" };

	valueTrue(): String { "true" };
	valueFalse(): String { "false" };

	space(): String { " " };
	emptyString(): String { "" };

	directionAscendent(): String { "ascendent" };
	directionDescendent(): String { "descendent" };

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
			else
				abort()
			fi fi fi fi fi fi fi fi;
		}
	};

    main(): Object {
		let currentAction: Int <- 0,
		inStr: String <- ""
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
			while looping loop {
				inStr <- in_string();
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
				} else if 0 < inStr.length() then {
					if "print" = inStr.substr(0, 5) then {
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
								out_string("[ ".concat(list.toString()).concat(" ]"));
							} fi;
							
						};
					} else {
						0;
					}
				}
				 else {
					out_string("Invalid command");
					abort();
				} fi fi fi;
					
			} pool;
		}
    };
};