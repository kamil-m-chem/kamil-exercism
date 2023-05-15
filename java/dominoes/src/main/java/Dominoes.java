import java.util.ArrayList;
import java.util.List;

public class Dominoes {

    public List<Domino> formChain(List<Domino> dominoesList) throws ChainNotFoundException {
        if (dominoesList.isEmpty() ||
                dominoesList.size()==1 && (dominoesList.get(0).getLeft()== dominoesList.get(0).getRight())) {
            return dominoesList;
        }
        if (dominoesList.size()==1) throw new ChainNotFoundException("No domino chain found.");

        List<Domino> newDominoChain = new ArrayList<>();

        for (int i=0; i<dominoesList.size();i++){

            int left = dominoesList.get(i).getLeft();
            int right = dominoesList.get(i).getRight();

        }

        return null;
    }
    private Domino switchSides(Domino domino){
        return new Domino(domino.getRight(), domino.getLeft());
    }
}
