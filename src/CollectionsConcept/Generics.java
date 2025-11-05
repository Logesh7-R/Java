package CollectionsConcept;
class ParentGenerics<T>{
    T val;
    ParentGenerics(){
        this.val = null;
    }
    ParentGenerics(T val){
        this.val = val;
    }
    void displayParent(){
        System.out.println("Parent Generics "+this.val);
    }
}
class ChildGenerics<T extends Number> extends ParentGenerics<T>{
    T val2;
    ChildGenerics(T val1,T val2){
        super(val1);
        this.val2 = val2;
    }
    ChildGenerics(){
        super();
        this.val2 = null;
    }
    void displayChild(){
        System.out.println("Child Generics "+super.val+" "+this.val2);
    }
}
public class Generics {
    public static void main(String[] args) {
        ParentGenerics<String> obj1 = new ParentGenerics<>("Obj1");
        obj1.displayParent();
        ParentGenerics<Integer> obj2 = new ChildGenerics<>(29,25);
        obj2.val = 11;
        obj2.displayParent();
        ChildGenerics<Integer> obj3 = new ChildGenerics<>(5,11);
        obj3.displayChild();
        obj3.displayParent();
        Integer dummy = 1;
        ParentGenerics<? extends Number> obj4 = new ChildGenerics<>(dummy,dummy);
//        obj4.val = 11; Error
        obj4.displayParent();

        ParentGenerics<? super Integer> obj5 = new ParentGenerics<>(obj4);

//        obj5.val = obj4 ;
        obj5.displayParent();
        System.out.println(obj4.hashCode());

    }

}
