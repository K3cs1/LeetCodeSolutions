package substring_with_concatenation_of_all_words_30;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testExample1() {
		List<Integer> result = solution.findSubstring( "barfoothefoobarman", new String[]{ "foo", "bar" } );
		assertEquals( List.of( 0, 9 ), sorted( result ) );
	}

	private List<Integer> sorted( List<Integer> list ) {
		return list.stream().sorted().toList();
	}

	@Test
	void testNoMatch() {
		List<Integer> result = solution.findSubstring( "wordgoodgoodgoodbestword", new String[]{ "word", "good", "best", "word" } );
		assertTrue( result.isEmpty() );
	}

	@Test
	void testDuplicateWordsInInput() {
		List<Integer> result = solution.findSubstring( "barfoofoobarthefoobarman", new String[]{ "bar", "foo", "the" } );
		assertEquals( List.of( 6, 9, 12 ), sorted( result ) );
	}

	@Test
	void testWordsWithRepeats() {
		List<Integer> result = solution.findSubstring( "wordgoodgoodgoodbestword", new String[]{ "word", "good", "best", "good" } );
		assertEquals( List.of( 8 ), sorted( result ) );
	}

	@Test
	void testOverlappingMatches() {
		List<Integer> result = solution.findSubstring( "foobarfoobar", new String[]{ "foo", "bar" } );
		assertEquals( List.of( 0, 3, 6 ), sorted( result ) );
	}

	@Test
	void testSameMatchOccursTwice() {
		List<Integer> result = solution.findSubstring( "barfoobarfoo", new String[]{ "bar", "foo" } );
		assertEquals( List.of( 0, 3, 6 ), sorted( result ) );
	}

	@Test
	void testSingleWord() {
		List<Integer> result = solution.findSubstring( "abcabc", new String[]{ "abc" } );
		assertEquals( List.of( 0, 3 ), sorted( result ) );
	}

	@Test
	void testAllSameWords() {
		List<Integer> result = solution.findSubstring( "aaaaaa", new String[]{ "a", "a" } );
		assertEquals( List.of( 0, 1, 2, 3, 4 ), sorted( result ) );
	}

	@Test
	void testStringShorterThanConcatenation() {
		List<Integer> result = solution.findSubstring( "foo", new String[]{ "foo", "bar" } );
		assertTrue( result.isEmpty() );
	}

	@Test
	@Timeout( 5 )
	void testLargeInputWithManyWords() {
		String s = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
		String[] words = { "dhvf", "sind", "ffsl", "yekr", "zwzq", "kpeo", "cila", "tfty", "modg", "ztjg", "ybty", "heqg", "cpwo", "gdcj", "lnle", "sefg", "vimw", "bxcb" };
		List<Integer> result = solution.findSubstring( s, words );
		assertEquals( List.of( 935 ), sorted( result ) );
	}
}
