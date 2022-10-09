class StringTokenizer {
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
};