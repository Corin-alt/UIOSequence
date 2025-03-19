package fr.corentin.w.core;

import java.util.List;

/**
 * Represents the result of the W algorithm execution.
 * <p>
 * This record encapsulates both the discrimination tree generated by the W algorithm
 * and the intermediate steps taken during the algorithm's execution.
 * </p>
 *
 * @author Corentin
 * @version 1.0
 * @see Node
 * @see Step
 */
public record WResult(Node tree, List<Step> steps) {
    /**
     * Constructs a new WResult with the specified tree and steps.
     *
     * @param tree The discrimination tree generated by the W algorithm
     * @param steps The intermediate steps performed during algorithm execution
     */
    public WResult {
        // No additional validation needed in the compact constructor
    }

    /**
     * Returns the discrimination tree.
     *
     * @return The root node of the discrimination tree
     */
    @Override
    public Node tree() {
        return tree;
    }

    /**
     * Returns the list of steps performed during algorithm execution.
     *
     * @return The list of intermediate steps
     */
    @Override
    public List<Step> steps() {
        return steps;
    }
}