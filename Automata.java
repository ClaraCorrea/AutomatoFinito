package aula1311Comp;

import java.util.HashMap;
import java.util.HashSet;

public class Automata {
    private HashMap<Integer, State> states;
    private HashMap<Integer, State> finalState;
    private HashSet<Transition> transitions;
    private State startState;
    private static int startStateLimit = 0;

    public Automata() {
        this.states = new HashMap<>();
        this.finalState = new HashMap<>();
        this.transitions = new HashSet<>();
        this.startState = null;
    }

    public void setState(int id, String label) {
        String name = "q" + id;
        State newState = new State(id, name, label);
        states.put(id, newState);
    }

    public void setFinalState(int id) {
        State finalState = getState(id);
        if (finalState != null) {
            this.finalState.put(id, finalState);
        }
    }

    public void setStartState(int id) {
        State startState = getState(id);
        if (startState != null) {
            this.startState = startState;
        }
    }

    public void setTransition(int origin, int destiny, String symbol) {
        State originS = getState(origin);
        State destinyS = getState(destiny);

        if (originS != null && destinyS != null) {
            Transition newTransition = new Transition(originS, destinyS, symbol);
            transitions.add(newTransition);
        }
    }

    public Transition getTransition(int origin, String symbol) {
        for (Transition transition : transitions) {
            if (transition.getOrigin().getId() == origin && transition.getSymbol().equals(symbol)) {
                return transition;
            }
        }
        return null;
    }

    public State getStartState() {
        return startState;
    }

    public State getFinalState(int id) {
        return states.get(id);
    }

    public int getFinalStateSize() {
        return finalState.size();
    }

    public State getState(int id) {
        return states.get(id);
    }

    public boolean isStartState(int id) {
        return startState != null && startState.getId() == id;
    }

    public boolean isFinalState(int id) {
        return finalState.containsKey(id);
    }

    private void message(String msg) {
        System.out.println(msg);
    }
}
