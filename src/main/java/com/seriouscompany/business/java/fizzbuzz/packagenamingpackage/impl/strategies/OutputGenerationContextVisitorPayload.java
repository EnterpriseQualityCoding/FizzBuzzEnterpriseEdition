package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.LoopContextStateRetrievalToSingleStepOutputGenerationAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopContextStateRetrieval;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.loop.LoopPayloadExecution;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.OutputGenerationStrategy;

/**
 * Payload for OutputGenerationContextVisitor
 */
@Service
public class OutputGenerationContextVisitorPayload implements LoopPayloadExecution {
	private final ResultCollection<OutputGenerationContext> _results;
	private final OutputGenerationContextVisitor contextVisitor;

	/**
	 * @param _results ResultCollection<OutputGenerationContext>
     * @param contextVisitor OutputGenerationContextVisitor
	 */
	@Autowired
	public OutputGenerationContextVisitorPayload(final ResultCollection<OutputGenerationContext> _results, final OutputGenerationContextVisitor contextVisitor) {
		super();
		this._results = _results;
        this.contextVisitor = contextVisitor;
	}

	/**
	 * @param stateRetrieval LoopContextStateRetrieval
	 * @return void
	 */
	@Override
	public void runLoopPayload(final LoopContextStateRetrieval stateRetrieval) {
        int controlParameterValue = stateRetrieval.getControlParameter();
        List<Result<OutputGenerationContext>> resultsList = _results.getResults();
		OutputGenerationContext outputGenerationContext = resultsList.get(controlParameterValue);
        this.contextVisitor.visit(outputGenerationContext, controlParameterValue);
	}

}
