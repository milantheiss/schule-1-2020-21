class Schiffe {
    private byte anzahlSchiffe;
    private byte ships[][] = new byte[anzahlSchiffe][3];
    private int blockedSquares[][] = new int[anzahlSchiffe][3];
    public Schiffe(byte anzahl){
        anzahlSchiffe = anzahl;
    }
    void setShips() {
        for (int i = 0; i < anzahlSchiffe; i++) {
            ships[i][0] = (byte) (Math.random() * 2); //Rotation des Schiffes 0 == horizontal | 1 == vertikal
            if (ships[i][0] == 0) { //horizontales Schiff
                ships[i][1] = (byte) ((Math.random() * 8) + 1); //X Koordinate
                ships[i][2] = (byte) ((Math.random() * 10) + 1); //Y Koordinate
            } else if (ships[i][0] == 1) { //vertikales Schiff
                ships[i][1] = (byte) ((Math.random() * 10) + 1); //X Koordinate
                ships[i][2] = (byte) ((Math.random() * 8) + 1); //Y Koordinate
            } else {
                System.out.println("Fehler");
            }
        }
    }
    void setBlockedSquares(){
        for (int i = 0; i < anzahlSchiffe; i++) {
            if (ships[i][0] == 0) { //Wenn Schiff horizontal
                blockedSquares[i][1] = (ships[i][1]*10)+ships[i][2]; //Startposition
                if(blockedSquares[i][1] < 90){ //Wenn Startposition auf X(9) oder höher
                    blockedSquares[i][2] = ((ships[i][1]-1)*10)+ships[i][2];
                    blockedSquares[i][2] = ((ships[i][1]-2)*10)+ships[i][2];
                }
                else { //Wenn Startposition niedriger als X(9) --> max X(8)
                    blockedSquares[i][2] = ((ships[i][1]+1)*10)+ships[i][2];
                    blockedSquares[i][2] = ((ships[i][1]+2)*10)+ships[i][2];
                }
            }
            else if(ships[i][0] == 1){ //Wenn Schiff vertikal
                blockedSquares[i][1] = (ships[i][1]*10)+ships[i][2]; //Startposition
                if(blockedSquares[i][1] < 90){ //Wenn Startposition auf X(9) oder höher
                    blockedSquares[i][2] = ((ships[i][1]-1)*10)+ships[i][2];
                    blockedSquares[i][2] = ((ships[i][1]-2)*10)+ships[i][2];
                }
                else { //Wenn Startposition niedriger als X(9) --> max X(8)
                    blockedSquares[i][2] = ((ships[i][1]+1)*10)+ships[i][2];
                    blockedSquares[i][2] = ((ships[i][1]+2)*10)+ships[i][2];
                }
            }
        }
    }
    int[][] getBlockedSquares(){
        return blockedSquares;
    }
}
