package assign2.ngram;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @version 1.0
 * @author ChuanLi
 * @created 2014.5.16.
 */
public class NGramNodeTest {
	// ---------------------------------------------------------------
	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when words is null or empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_Words_NullOrEmpty_Test()
			throws NGramException {

		String[] words = null;
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when words contain at least have null string
	 * then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_WordsEntry_Null_Test()
			throws NGramException {

		String[] words = { "to", null, "be" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when words contain at least have one empty
	 * string then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_WordsEntry_Empty_Test()
			throws NGramException {

		String[] words = { "to", "", "be" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions is null or empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_Predictions_nullOrEmpty_Test()
			throws NGramException {

		String[] words = { "to", "be", "or" };
		String[] predictions = null;
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions contains at least one empty or
	 * null string then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_PredictionsEntry_Null_Test()
			throws NGramException {

		String[] words = { "to", "be", "or" };
		String[] predictions = { "to", "be", null };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions contains at least one empty or
	 * null string then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_PredictionsEntry_Empty_Test()
			throws NGramException {

		String[] words = { "to", "be", "or" };
		String[] predictions = { "to", "", "be" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities is null then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_Probabilities_NullOrEmpty_Test()
			throws NGramException {

		String[] words = { "to", "", "" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = null;
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is null then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_ProbabilitiesEntry_NullOrEmpty_Test()
			throws NGramException {

		String[] words = { "to", "be", "or" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { null, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is zero then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_ProbabilitiesEntry_Zero_Test()
			throws NGramException {

		String[] words = { "to", "", "" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.11, 0.00, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is zero then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_ProbabilitiesEntry_Negative_Test()
			throws NGramException {

		String[] words = { "to", "", "" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, -0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which greater than 1.0 then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_ProbabilitiesEntry_Greater1_Test()
			throws NGramException {
	   
		String[] words = { "to", "", "" };
		String[] predictions = { "to", "be", "or", "not" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions.length is different from
	 * probabilities.length then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor1_Exception_PredLength_Differ_ProbLength_Test()
			throws NGramException {

		String[] words = { "to", "be", "or" };
		String[] predictions = { "to", "be", "or", "not" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String,java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when context is null then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_Context_Null_Test()
			throws NGramException {

		String context = null;
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String,java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when context is empty then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_Context_Empty_Test()
			throws NGramException {

		String context = "";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String,java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions is null or empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_Predictions_NullOrEmpty_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = null;
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions contains at least one null
	 * string then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_PredictionsEntry_Null_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", null };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions contains at least one empty
	 * string then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_PredictionsEntry_Empty_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "", "be", "not" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities is null then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_Probabilities_NullOrEmpty_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = null;
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is null then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_ProbabilitiesEntry_nullOrEmpty_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { null, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String[], java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is zero then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_ProbabilitiesEntry_Zero_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.11, 0.00, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which is zero then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_ProbabilitiesEntry_Negative_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, -0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when probabilities contains at least one entry
	 * which greater than 1.0 then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_ProbabilitiesEntry_Greater1_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 1.6, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#NGramNode(java.lang.String, java.lang.String[],java.lang.Double[])}
	 * . <br/>
	 * <br/>
	 * Test NGramNode construct, when predictions.length is different from
	 * probabilities.length then throw NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Constructor2_Exception_PredLength_Differ_ProbLength_Test()
			throws NGramException {

		String context = "to";
		String[] predictions = { "to", "be", "or", "not" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		@SuppressWarnings("unused")
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
	}

	/**
	 * Test method : 
	 * {@link assign2.ngram.NGramNode#getContext()}. <br/>
	 * <br/>
	 * Test getContext() method get context by using constructor 1
	 * 
	 * @throws NGramException
	 */
	@Test
	public void Test_words_getContext() throws NGramException {
		String[] words = { "to", "or", "not" };
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")
		// String context = "to or not";
		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		assertEquals("to or not", ngram.getContext());
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if context is null then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextString_Exception_contextNull_Test()
			throws NGramException {
		String[] words = { "to", "be", "or" };
		String context = null;
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(context);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if context is empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextString_Exception_contextEmpty_Test()
			throws NGramException {
		String[] words = { "to", "be", "or" };
		String context = "";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(context);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() method set context by using constructor 1
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextString() throws NGramException {
		String[] words = { "to", "be", "or" };
		String context = "my book is";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(context);
		assertEquals(context, ngram.getContext());
	}
	

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if context is null then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextArraryString_Exception_wordsNull_Test()
			throws NGramException {
		String[] words = null;
		// String context = null;
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(words);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if words is empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextArrayString_Exception_wordsEmpty_Test()
			throws NGramException {
		String[] words = { };
		// String context = "";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(words);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if context is null then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContexArraryString_Exception_wordsEntryNull_Test()
			throws NGramException {
		String[] words = { "to", "be", null };
		String context = null;
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(words);
	}

	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() by using constructor 1 if words is empty then throw
	 * NGramException
	 * 
	 * @throws NGramException
	 */
	@Test(expected = NGramException.class)
	public void Test_words_setContextArrayString_Exception_wordsEntryEmpty_Test()
			throws NGramException {
		String[] words = { "to", "", "or" };
		String context = "";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(words);
	}

	
	/**
	 * Test method :
	 * {@link assign2.ngram.NGramNode#setContext(java.lang.String)}. <br/>
	 * <br/>
	 * Test setContext() method set context by using constructor 1
	 * 
	 * @throws NGramException
	 */
	@Test
	public void Test_words_setContextArrayString() throws NGramException {
		String[] words = { "to", "be", "or" };
		String context = "my book is";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")

		NGramNode ngram = new NGramNode(words, predictions, probabilities);
		ngram.setContext(words);
		assertEquals(context, ngram.getContext());
	}
	/**
	 * Test method : {@link assign2.ngram.NGramNode#getContext()}. <br/>
	 * <br/>
	 * Test getContext() method get context by using constructor 2
	 * 
	 * @throws NGramException
	 */
	@Test
	public void Test_context_getContext() throws NGramException {
		String context = "my book is";
		String[] predictions = { "to", "be", "or" };
		Double[] probabilities = { 0.111, 0.222, 0.333 };
		// @SuppressWarnings("unused")
		// String context = "to or not";
		NGramNode ngram = new NGramNode(context, predictions, probabilities);
		assertEquals("my book is", ngram);
	}
	
	@Test
	public void Test_setContext_String() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetContextStringArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPredictions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPredictions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProbabilities() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProbabilities() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
