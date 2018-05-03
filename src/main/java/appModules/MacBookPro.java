package appModules;

public class MacBookPro {
	
	String screenSize;
	String processor;
	String colour;
	String software;
	String displayAdapter;	
	
	
	public MacBookPro(String screenSize, String processor, String colour, String software, String displayAdapter) {
		this.screenSize = screenSize;
		this.processor = processor;
		this.colour = colour;
		this.software = software;
		this.displayAdapter = displayAdapter;
	}
	
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getDisplayAdapter() {
		return displayAdapter;
	}
	public void setDisplayAdapter(String displayAdapter) {
		this.displayAdapter = displayAdapter;
	}
	
	
	
	

}
