package aula1311Comp;

public class Transition {
    private State origin;
    private State destiny;
    private String symbol;

    public Transition(State origin, State destiny, String symbol) {
        this.origin = origin;
        this.destiny = destiny;
        this.symbol = symbol; 
    }

	public State getOrigin() {
		return origin;
	}
	public void setOrigin(State origin) {
		this.origin = origin;
	}
	public State getDestiny() {
		return destiny;
	}
	public void setDestiny(State destiny) {
		this.destiny = destiny;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
} 