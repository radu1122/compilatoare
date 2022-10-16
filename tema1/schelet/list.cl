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
};