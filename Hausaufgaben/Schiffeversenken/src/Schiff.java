class Schiff {
    byte rotation, length, xPos, yPos;
    public Schiff(){
        rotation = (byte)(Math.random()*1); //Bei 0 Horizontal; Bei 1 Vertikal
        length = (byte)((Math.random()*4)+2); //Länge des Schiffs
        xPos = (byte)((Math.random()*10)+1); //Äußere Ecke des Schiffes -- X
        yPos = (byte)((Math.random()*10)+1); //Äußere Ecke des Schiffes -- Y
    }
    byte getRotation(){
        return rotation;
    }
    byte getLength(){
        return length;
    }
    byte getxPos(){
        return xPos;
    }
    byte getyPos(){
        return yPos;
    }
}
