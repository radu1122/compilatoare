class List {

    first: Object;
	elems: List;
    
	init(o: Object, l: List): SELF_TYPE {{
		first <- o;
		elems <- l;
		self;
	}};

    first(): Object {{
        first;
    }};

    elems(): List {{
        elems;
    }};

    add(elem : Object): List {
        if isvoid first then
			init(elem, new List)
		else
			elems.add(elem)
		fi
    };

    get(index: Int): Object {
		if index = 1 then
			head
		else
			tail.get(index - 1)
		fi
	};

    elemToString(elem : Object): String {
        case head of
		elemX: Int =>
			"Int(".concat(new A2I.i2a(elemX)).concat(")");
		elemX: String =>
			"String(".concat(elemX).concat(")");
		elemX: Bool =>
			if elemX then
				elemX.type_name().concat("(true)")
			else
				elemX.type_name().concat("(false)")
			fi;
        
		elemX: IO => "IO()";
		elemX: Object => "Object()";
		elemX: Product => elemX.toString();
		elemX: Rank => elemX.toString();
		esac
    };

    toString(): String {
        let stringElems: String <- "",
            firstLocal: Object <- first,
            elemsLocal: List <- elems
        in {
            if isvoid first then
                stringElems <- ""
            else {
                stringElems <- firstLocal.toString();
                while not isvoid elemsLocal loop {
                    firstLocal <- elemsLocal.first();
                    elemsLocal <- elemsLocal.elems();
                    stringElems <- stringElems.concat(firstLocal.toString()).concat(", ");
                } pool;
            } fi;
            -- stringElems <- stringElems.substring(0, stringElems.length() - 2);
            "[ ".concat(stringElems).concat(" ]\n");
            stringElems;
        }
    };

    merge(other : List): SELF_TYPE {
        self (* TODO *)
    };

    filterBy(): SELF_TYPE {
        self (* TODO *)
    };

    sortBy(): SELF_TYPE {
        self (* TODO *)
    };
};class Main inherits IO{
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
		in
			if token = new Soda.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Soda.init(name, model, price);
				}
			else if token = new Coffee.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Coffee.init(name, model, price);
				}
			else if token = new Laptop.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
				in {
					new Laptop.init(name, model, price);
				}
			else if token = new Router.type_name() then
				let name: String <- tokenizer.nextToken(),
					model: String <- tokenizer.nextToken(),
					price: String <- tokenizer.nextToken()
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

    main(): Object {
		let currentAction <- 0,
		inStr: String <- ""
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
};class StringTokenizer {
    -- we wil only use space as a delimiter
	inputStr: String;
	pos: Int;
	len: Int;
	delim: String;

	init(inputStr: String): SELF_TYPE {{
		pos <- 0;
		inputStr <- inputStr;
		len <- str.length();
		self;
	}};

    hasMoreTokens(): Bool {{
        pos < len;
    }};

    nextToken(): String {
		let token: String <- "",
			localPos: Int <- pos
		in {
			while localPos < len loop {
				if str.substr(pos, 1) = delim then {
					pos <- pos + 1;
					localPos <- len;
				} else {
					token <- token.concat(str.substr(pos, 1));
					pos <- pos + 1;
					localPos <- pos;
				} fi;
			} pool;

			token;
		}
	};
};(*******************************
 *** Classes Product-related ***
 *******************************)
class Product {
    name : String;
    model : String;
    price : Int;

    init(n : String, m: String, p : Int):SELF_TYPE {{
        name <- n;
        model <- m;
        price <- p;
        self;
    }};

    getprice():Int{ price * 119 / 100 };

    toString():String {
        type_name().concat("(").concat(name).concat(",").concat(model).concat(")")
    };
};

class Edible inherits Product {
    -- VAT tax is lower for foods
    getprice():Int { price * 109 / 100 };
};

class Soda inherits Edible {
    -- sugar tax is 20 bani
    getprice():Int {price * 109 / 100 + 20};
};

class Coffee inherits Edible {
    -- this is technically poison for ants
    getprice():Int {price * 119 / 100};
};

class Laptop inherits Product {
    -- operating system cost included
    getprice():Int {price * 119 / 100 + 499};
};

class Router inherits Product {};

(****************************
 *** Classes Rank-related ***
 ****************************)
class Rank {
    name : String;

    init(n : String):String {
        name <- n
    };

    toString():String {
        -- Hint: what are the default methods of Object?
        type_name().concat("(").concat(name).concat(")")
    };
};

class Private inherits Rank {};

class Corporal inherits Private {};

class Sergent inherits Corporal {};

class Officer inherits Sergent {};(* Think of these as abstract classes *)
class Comparator {
    compareTo(o1 : Object, o2 : Object):Int {0};
};

class Filter {
    filter(o : Object):Bool {true};
};

(* TODO: implement specified comparators and filters*)