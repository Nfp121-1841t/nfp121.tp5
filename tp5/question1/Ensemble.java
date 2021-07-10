package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        // à compléter pour la question1-1
        
        return table.add(t);
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
       
       boolean bool = this.addAll(e);
       if(bool) return this ;
       return this;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        
       boolean bool = this.retainAll(e);
       if(bool) return this ;
       return this;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
       boolean bool = this.removeAll(e);
       if(bool) return this ;
       return this;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> ee = new Ensemble<T>();
        ee.addAll(this.union(e));
        ee.removeAll(this.inter(e));
        return ee;
      
    }
    
}
