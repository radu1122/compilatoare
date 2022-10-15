class List {

    (* TODO: store data *)

    add(o : Object):SELF_TYPE {
        self (* TODO *)
    };

    toString():String {
        "[TODO: implement me]"
    };

    merge(other : List):SELF_TYPE {
        self (* TODO *)
    };

    filterBy():SELF_TYPE {
        self (* TODO *)
    };

    sortBy():SELF_TYPE {
        self (* TODO *)
    };
};class Main inherits IO{
    lists : List <- new List;
    looping : Bool <- true;
    somestr : String;
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

    main():Object {
		currentAction <- 0;
        while looping loop {
            inStr <- in_string();
            if inStr == "help" then {
                out_string("Available commands: load, print, merge, filterBy, sortBy");
            } else if inStr == "load" then {
				currentAction <- 1;
				
        } pool
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

    nextToken(): String {{
        let start: Int <- pos;
        while pos < len and inputStr[pos] ~= ' ' loop
            pos <- pos + 1;
        end loop;
        let token: String <- inputStr.substr(start, pos - start);
        pos <- pos + 1;
        token;
    }};
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