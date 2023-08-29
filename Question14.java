package com.cozentus.JavaTask;

abstract class Instrument {
	
	  public abstract void play();
	  public abstract void tune();
}

class Glockenspiel extends Instrument {

	  public void play() {
	    System.out.println("Glockenspiel play");
	  }
	  public void tune() {
	    System.out.println("Glockenspiel tune");
	  }
}

class Violin extends Instrument {

	  public void play() {
	    System.out.println("Violin play");
	  }
	  public void tune() {
	    System.out.println("Violin tune");
	  }
}

public class Question14 {
	  public static void main(String[] args) {
		  
	    Instrument g = new Glockenspiel();
	    Instrument v = new Violin();

	    g.play();
	    g.tune();
	    System.out.println();
	    v.play();
	    v.tune();
	  }
}
