class Main inherits IO{
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
};