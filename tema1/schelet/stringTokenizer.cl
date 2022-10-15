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
        let start: Int <- pos;
        while pos < len and inputStr[pos] ~= ' ' loop
            pos <- pos + 1;
        end loop;
        let token: String <- inputStr.substr(start, pos - start);
        pos <- pos + 1;
        token;
    }};
};