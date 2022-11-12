class StringTokenizer inherits IO {
    -- we wil only use space as a delimiter
	inputStr: String;
	pos: Int;
	len: Int;
	delim: String <- " ";

	init(inputStrX: String): SELF_TYPE {{
		pos <- 0;
		inputStr <- inputStrX;
		len <- inputStr.length();
		self;
	}};

    hasMoreTokens(): Bool {{
        pos < len;
    }};

    nextToken(): String {
		let token: String <- "",
			localPos: Int <- pos
		in {
			while localPos < len loop {
				if inputStr.substr(pos, 1) = delim then {
					pos <- pos + 1;
					localPos <- len;
				} else {
					token <- token.concat(inputStr.substr(pos, 1));
					pos <- pos + 1;
					localPos <- pos;
				} fi;
			} pool;
			token;
		}
	};
};