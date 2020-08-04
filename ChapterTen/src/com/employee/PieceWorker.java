package com.employee;

public class PieceWorker extends Employee {
    private int wagePerPiece;
    private int numberOfPieces;

    public PieceWorker(String firstName,String lastName,String socialSecurityNumber,Date dateOfBirth, int wagePerPiece,int numberOfPieces){
        super(firstName,lastName,socialSecurityNumber,dateOfBirth);
        this.wagePerPiece = wagePerPiece;
        this.numberOfPieces = numberOfPieces;
    }

    public int getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(int wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public double getEarnings(){
        return wagePerPiece * numberOfPieces;
    }

    @Override
    public String toString(){
        return String.format("%s%n Employee Type: %s%n Earning: %.3f",super.toString(),getClass().getSimpleName(),getEarnings());
    }
}
