(* Think of these as abstract classes *)
class Comparator {
    compareTo(o1 : Object, o2 : Object):Int {0};
};

class Filter {
    filter(o : Object): Bool {true};
};

class ProductFilter inherits Filter {
    filter(o : Object): Bool {
        case o of
        elem: Product => true;
        elem: Object => false;
        esac
    };
};

class RankFilter inherits Filter {
    filter(o : Object): Bool {
        case o of
        elem: Rank => true;
        elem: Object => false;
        esac
    };
};

class SamePriceFilter inherits Filter {
    filter(o : Object): Bool {
        case o of
        elem: Product => elem.getprice() = elem@Product.getprice();
        elem: Object => false;
        esac
    };
};

(* TODO: implement specified comparators and filters*)