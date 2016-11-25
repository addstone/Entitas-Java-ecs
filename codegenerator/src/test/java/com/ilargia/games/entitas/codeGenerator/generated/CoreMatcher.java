package com.ilargia.games.entitas.codeGenerator.generated;

import com.ilargia.games.entitas.interfaces.IMatcher;
import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp. Changes to
 * this file may cause incorrect behavior and will be lost.
 * 
 * ---------------------------------------------------------------------------
 */
public class CoreMatcher {

	private static IMatcher _matcherBall;
	private static IMatcher _matcherScore;
	private static IMatcher _matcherBounds;
	private static IMatcher _matcherPlayer;
	private static IMatcher _matcherView;
	private static IMatcher _matcherMotion;

	public static IMatcher Ball() {
		if (_matcherBall == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.Ball);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherBall = matcher;
		}
		return _matcherBall;
	}

	public static IMatcher Score() {
		if (_matcherScore == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.Score);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherScore = matcher;
		}
		return _matcherScore;
	}

	public static IMatcher Bounds() {
		if (_matcherBounds == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.Bounds);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherBounds = matcher;
		}
		return _matcherBounds;
	}

	public static IMatcher Player() {
		if (_matcherPlayer == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.Player);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherPlayer = matcher;
		}
		return _matcherPlayer;
	}

	public static IMatcher View() {
		if (_matcherView == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.View);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherView = matcher;
		}
		return _matcherView;
	}

	public static IMatcher Motion() {
		if (_matcherMotion == null) {
			Matcher matcher = (Matcher) Matcher.AllOf(CoreComponentIds.Motion);
			matcher.componentNames = CoreComponentIds.componentNames();
			_matcherMotion = matcher;
		}
		return _matcherMotion;
	}
}