class SortingMachine{
    public void sort(Relatable[] a){
        for( int i = 0; i < a.length; i++ ){
            int mini = i;
            for( int j = i +1; j < a.length; j++ ){
                if( a[j].isSmallerThan(a[mini]) ) mini = j;
            }
            Relatable t = a[mini];
            a[mini] = a[i];
            a[i] = t;
        }
    }
}