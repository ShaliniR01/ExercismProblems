class ResistorColor {
    int colorCode(String color) {
		String[] colorCodes = colors();
	  	int i;
        for(i=0;i<9;i++){
	  		if(color==colorCodes[i]){
				return i;
			}
		}
		return i;
    }

    String[] colors() {
        String[] colors={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		return colors;
    }
}
