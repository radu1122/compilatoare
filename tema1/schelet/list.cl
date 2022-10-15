class List {

    first: Object;
	elems: List;
    
    init (first: Object, elems: List): SELF_TYPE {
        first = first;
        elems = elems;
        self
    }

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
		ElemX: Rank => ElemX.toString();
		esac

    toString(): String {
        stringElems: String <- "";
        oldFirst: Object <- first;
        oldElems: List <- elems;
        if isvoid first then
            stringElems <- ""
        else
            stringElems <- first.toString();
            while not isvoid elems loop
                first <- elems.first;
                elems <- elems.elems;
                stringElems <- stringElems.concat(first.toString()).concat(", ");

        fi;
        first <- oldFirst;
        elems <- oldElems;
        -- stringElems <- stringElems.substring(0, stringElems.length() - 2);
        "[ ".concat(stringElems).concat(" ]\n")
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
};