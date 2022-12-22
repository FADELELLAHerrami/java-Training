package defaultt;
public class Context {
	protected Strategy s = new StrategyImpl3();
	public void effectuerStrategy() {
		s.operationStrategy();
	}
	public static void main(String[] args) {
		Context c = new Context();
		c.effectuerStrategy();
	}
}
