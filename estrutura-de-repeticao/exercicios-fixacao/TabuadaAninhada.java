class TabuadaAninhada{
    public static void main(String args[]){
        int n = 5;
        // Qntd. de tabuadas
        for (int i = n; i <= n+2; i++){
            // Construção das tabuadas
            for(int j=0; j<=10; j++){
                System.out.print("\n" + i + " X " + j + " = " + j*i);
            }
            System.out.println();
        }
    }
}