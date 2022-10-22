class List {

    first: Object;
	elems: List;
    len: Int <- 0;

    
	init(o: Object, l: List): SELF_TYPE {{
		first <- o;
		elems <- l;
		self;
	}};

    first(): Object {{
        first;
    }};

    size (): Int {{
        len;
    }};

    elems(): List {{
        elems;
    }};

    add(elem : Object): List {{
        len <- len + 1;
        if isvoid first then
			init(elem, new List)
		else
			elems.add(elem)
		fi;
    }};

    get(index: Int): Object {
		if index = 0 then
			first
		else
			elems.get(index - 1)
		fi
	};

    elemToString(elem : Object): String {
        case first of
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
                case firstLocal of
                    x: Product =>
                        stringElems <- x.toString();
                    x: Rank =>
                        stringElems <- x.toString();
                    x: List =>
                        stringElems <- x.toString();
                esac;
                while not isvoid elemsLocal loop {
                    firstLocal <- elemsLocal.first();
                    elemsLocal <- elemsLocal.elems();
                    if not isvoid firstLocal then
                        case firstLocal of
                            x: Product =>
                                stringElems <- stringElems.concat(", ").concat(x.toString());
                            x: Rank =>
                                stringElems <- stringElems.concat(", ").concat(x.toString());
                            x: List =>
                                stringElems <- stringElems.concat(", ").concat(x.toString());
                        esac
                    else
                        0
                    fi;
                } pool;
            } fi;
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