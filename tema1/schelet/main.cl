class Main inherits IO{
    lists : List <- new List;
    looping : Bool <- true;
    somestr : String;
	stringTokenizer : StringTokenizer <- new StringTokenizer;
    -- 0 = wait for input, 1 = taking input
    currentAction : Int;
    stateListen(): String { "listen" };
	stateLoad(): String { "load" };
	stateAction(): String { "action" };
	actionFilter(): String { "filterBy" };
	actionSort(): String { "sortBy" };
	actionMerge(): String { "merge" };
	actionHelp(): String { "help" };

	endLoad(): String { "END" };

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
					price: String <- tokenizer.nextToken()
				in {
					new Soda.init(name, model, price)
				}
			else if token = new Coffee.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Coffee.init(name, model, price)
				}
			else if token = new Laptop.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Laptop.init(name, model, price)
				}
			else if token = new Router.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Router.init(name, model, price)
				}
			else if token = new Private.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Private.init(name)
				}
			else if token = new Corporal.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Corporal.init(name)				
				}
			else if token = new Sergent.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Sergent.init(name)
				}
			else if token = new Officer.type_name() then
				let name: String <- tokenizer.nextToken()
				in {
					new Officer.init(name)
				}
			else
				abort()
		}

    main():Object {
		currentAction <- 0;
		let inStr: String <- "",
		in {
			while looping loop {
				inStr <- in_string();
				if inStr = "help" then {
					out_string("Available commands: load, print, merge, filterBy, sortBy");
				} else if inStr == "load" then {
					currentAction <- 1;
					let newList : List <- new List
					in {
						while currentAction = 1 loop
							inStr <- in_string();
							if inStr = endLoad() then
								currentAction <- 0;
							else
								newList.add(getListElement(inStr));
							fi
						pool;
						lists.add(newList);
						currentAction <- 0;
					}
				} else if inStr = inStr.substr(0, 5) then {
					let listIndex: String <- inStr.substr(6, inStr.length()),
						z : A2I <- new A2I,
						list: List <- lists.get(z.a2i(listIndex))
					in {
						list.toString();
					};
				} fi fi fi


					
			} pool
		}
    };
};