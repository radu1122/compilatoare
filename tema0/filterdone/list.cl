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

    replaceAtIndex (i: Int, o: Object): SELF_TYPE {{
        if i = 0 then
            first <- o
        else
            elems <- elems.replaceAtIndex(i - 1, o)
        fi;
        self;
    }};

    deleteElem(position : Int): SELF_TYPE {{
        len <- len - 1;
        if position = 0 then
            if not elems.size() = 0 then {
				init(elems.first(), elems.elems());
			} else {
  				init(new Object, new List);
                len <- 0;
			} fi
        else
            init(first, elems.deleteElem(position - 1))
        fi;
        self;
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
                    x: Object =>
                        stringElems <- stringElems.concat("Object()");
                    x: IO =>
                        stringElems <- stringElems.concat("IO()");
                    x: String =>
                        stringElems <- stringElems.concat("String(").concat(x).concat(")");
                    x: Int =>
                        stringElems <- stringElems.concat("Int(").concat(new A2I.i2a(x)).concat(")");
                    x: Bool =>
                        if x then
                            stringElems <- stringElems.concat("Bool(true)")
                        else
                            stringElems <- stringElems.concat("Bool(false)")
                        fi;
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
                            x: Object =>
                                stringElems <- stringElems.concat(", ").concat("Object()");
                            x: IO =>
                                stringElems <- stringElems.concat(", ").concat("IO()");
                            x: String =>
                                stringElems <- stringElems.concat(", ").concat("String(").concat(x).concat(")");
                            x: Int =>
                                stringElems <- stringElems.concat(", ").concat("Int(").concat(new A2I.i2a(x)).concat(")");
                            x: Bool =>
                                if x then
                                    stringElems <- stringElems.concat(", ").concat("Bool(true)")
                                else
                                    stringElems <- stringElems.concat(", ").concat("Bool(false)")
                                fi;
                        esac
                    else
                        0
                    fi;
                } pool;
            } fi;
            stringElems;
        }
    };

    merge(l1: List, l2: List): List {{
        if l1.size() = 0 then
            l2
        else
            new List.init(l1.first(), merge(l1.elems(), l2))
        fi;
    }}; 

    filterBy(filter: Filter): List {
        if isvoid first then
            self
        else
            if filter.filter(first) then
                new List.init(first, elems.filterBy(filter))
            else
                elems.filterBy(filter)
            fi
        fi
    };

    sortBy(): SELF_TYPE {
        self (* TODO *)
    };
};