package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;

/**
 * Payload for Iterator
 */
@Service
public class IteratorPayload<T> implements LoopPayloadExecution {

	private final Iterator<T> _iterator;
	private final ResultCollection<T> _results;

	/**
	 * @param _iterator Iterator
	 * @param _results ResultCollection<T>
	 */
	@Autowired
	public IteratorPayload(final Iterator<T> _iterator, final ResultCollection<T> _results) {
		super();
		this._iterator = _iterator;
	}

	/**
	 * @param stateRetrieval LoopContextStateRetrieval
	 * @return void
	 */
	@Override
	public void runLoopPayload(final LoopContextStateRetrieval stateRetrieval) {
		T resultValue = this._iterator.next();
		Result<T> result = new ActionResult();
		result.setResult(resultValue);
		this._results.addResult(result);
	}

}
