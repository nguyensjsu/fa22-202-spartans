public class CheckForColumnsHandler implements Handler {
    private Handler successor = null;

	public boolean handleRequest( SimplePane p, char token ) {
        boolean result = false;
        return result;
	}

	public void setSuccessor(Handler next) {
        this.successor = next ;
	}
}
