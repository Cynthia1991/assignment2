package assign2.ngram;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.research.webngram.service.GenerationService;
import com.microsoft.research.webngram.service.NgramServiceFactory;
import com.microsoft.research.webngram.service.GenerationService.TokenSet;

/**
 * @version 1.0
 * @author QianFu(Cynthia)
 * @created 2014.5.15.
 */
public class NGramStore implements NGramMap {

	/*
	 * public NGramMap{
	 * 
	 * }
	 */
	private List<NGramContainer> ngramContainersList = new ArrayList<NGramContainer>();
	private static final String Key = "068cc746-31ff-4e41-ae83-a2d3712d3e68";

	// private LinkedList<String[]> ngramList = new LinkedList<String[]>();
	/**
	 * 
	 * (Silently) Add an ngram to the Map. If the <code>context</code> does not
	 * exist in the Map, the entry is added.<br>
	 * If the <code>context</code> exists in the Map, then the associated ngram
	 * is updated (and thus overwritten).
	 * 
	 * @param ngram
	 *            - ngram to be added
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see assign2.ngram.NGramMap#addNGram(assign2.ngram.NGramContainer)
	 */
	@Override
	public void addNGram(NGramContainer ngram) {
		// TODO Auto-generated method stub
		// boolean EXIST = false; // judge whether or not the context exists in
		// the Map
		for (NGramContainer currentNgram : ngramContainersList) {
			if (currentNgram == ngram) {
				ngramContainersList.remove(currentNgram);// updated
			}
			// System.out.println(tmp);
		}
		ngramContainersList.add(ngram);

	}

	/**
	 * 
	 * (Silently) Remove an ngram from the Map. If the <code>context</code> does
	 * not exist in the Map, the entry is not removed, but no status is
	 * returned. We guarantee that the entry no longer exists<br>
	 * If the <code>context</code> exists in the Map, then the associated ngram
	 * is removed.
	 * 
	 * @param context
	 *            - context string for ngram to be removed
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see assign2.ngram.NGramMap#removeNGram(java.lang.String)
	 */
	@Override
	public void removeNGram(String context) {
		// TODO Auto-generated method stub
		for (NGramContainer currentNgram : ngramContainersList) {
			if (currentNgram.getContext() == context) {
				ngramContainersList.remove(currentNgram);// updated
			}
			// System.out.println(tmp);
		}

	}

	/**
	 * 
	 * Find the NGram associated with the context if it exists in the Map.
	 * Return null if the context is not a key in the Map.
	 * 
	 * @param context
	 * @return NGramContainer associated with the context or null
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see assign2.ngram.NGramMap#getNGram(java.lang.String)
	 */
	@Override
	public NGramContainer getNGram(String context) {
		// TODO Auto-generated method stub
		boolean EXIST = false; // whether or not the context exist in the map
		for (NGramContainer currentNgram : ngramContainersList) {
			if (currentNgram.getContext() == context) {
				// ngramContainersList.remove(currentNgram);//updated
				EXIST = true;
				return currentNgram;
			}
			// System.out.println(tmp);
		}
		return null;
	}

	/**
	 * 
	 * Get the top maxResults ngrams returned from the service.
	 * 
	 * @param context
	 *            - the context for the ngram search
	 * @param maxResults
	 *            - the maximum number of
	 * @return true and store the NGram in the Map if the service returns at
	 *         least one result<br>
	 *         return false and do not store the bare context if the service
	 *         returns no predictions
	 * @throws NGramException
	 *             if the service fails to connect or if the NGramContainer
	 *             cannot be created.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see assign2.ngram.NGramMap#getNGramsFromService(java.lang.String, int)
	 */
	@Override
	public boolean getNGramsFromService(String context, int maxResults)
			throws NGramException {

		try {
			NgramServiceFactory factory = NgramServiceFactory
					.newInstance(NGramStore.Key);

			if (factory == null) {
				// NGramException if the service fails to connect
				throw new NGramException(
						"ERROR: fail to connect to the service");
			}

			GenerationService service = factory.newGenerationService();
			// List<String> models = service.getModels();

			TokenSet tokenSet = service.generate(NGramStore.Key,
					"bing-body/2013-12/5", context, maxResults, null);

			/*
			 * return false and do not store the bare context if the service
			 * returns no predictions
			 */
			if (tokenSet == null || tokenSet.getWords() == null
					|| tokenSet.getWords().isEmpty()) {
				return false;
			}
			// get the predictions
			List<String> predictionsList = tokenSet.getWords();
			// get the probabilities
			List<Double> probabilitiesList_pre = tokenSet.getProbabilities();

			// Calculate the real probabilities
			List<Double> probabilitiesList = new ArrayList<Double>();
			for (double p : probabilitiesList_pre) {
				// change the formation of the probabilities
				probabilitiesList.add(Math.pow(10.0, p));
			}

			String[] predictions = (String[]) predictionsList
					.toArray(new String[0]);
			Double[] probabilities = (Double[]) probabilitiesList
					.toArray(new Double[0]);

			NGramNode ngramContainer = new NGramNode(context, predictions,
					probabilities);
			this.addNGram(ngramContainer);
			return true;
		} catch (NGramException e) {
			throw new NGramException(
					"ERROR: the NGramContainer cannot be created");
		}

		// throws NGramException if the NGramContainer cannot be created.
		// if(ngramContainer == )

		// return false;
	}
}
