package com.ilargia.games.core;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GamesessionMatcher {

	private static Matcher _matcherScore;

	public static Matcher Score() {
		if (_matcherScore == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GamesessionComponentIds.Score);
			matcher.componentNames = GamesessionComponentIds.componentNames();
			_matcherScore = matcher;
		}
		return _matcherScore;
	}
}