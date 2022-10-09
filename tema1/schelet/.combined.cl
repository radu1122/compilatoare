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
        while looping loop {
            intStr <- in_string();
            if intStr == "help" then {
                out_string("Available commands: load, print, merge, filterBy, sortBy");
            } else if intStr 
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
        if pos >= len then
            fail "no more tokens";
        end if;
        let start: Int <- pos;
        while pos < len and inputStr[pos] ~= ' ' loop
            pos <- pos + 1;
        end loop;
        let token: String <- inputStr.substr(start, pos - start);
        pos <- pos + 1;
        token;
    }};
	-- nextToken(): String {
	-- 	let token: String <- "",
	-- 		localPos: Int <- pos
	-- 	in {
	-- 		while localPos < len loop {
	-- 			if str.substr(pos, 1) = delim then {
	-- 				pos <- pos + 1;
	-- 				localPos <- len;
	-- 			} else {
	-- 				token <- token.concat(str.substr(pos, 1));
	-- 				pos <- pos + 1;
	-- 				localPos <- pos;
	-- 			} fi;
	-- 		} pool;

	-- 		token;
	-- 	}
	-- };
};(* Think of these as abstract classes *)
class Comparator {
    compareTo(o1 : Object, o2 : Object):Int {0};
};

class Filter {
    filter(o : Object):Bool {true};
};

(* TODO: implement specified comparators and filters*)