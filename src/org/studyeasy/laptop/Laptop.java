package org.studyeasy.laptop;

import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String cardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.cardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String cardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.cardDrive = cardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", cardDrive=" + cardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
		//این گتر پروسسور را خواندیم چون وقتی در کلاس پروسسور گتر را ست کردیم 
		//	هنگام فراخوانی در کلاس هلو دسترسی ابجکت لبی که از کلاس لپ تاپ خوانده شده بود نبود
		//	در کلاس لپ تاپم پروسسور به صورت کامپوزیت صدا زده شده بود 
	public Processor getProcessor() {
		return processor;
	}
	//سایر گتر ها را هم ست کردیم بخاطر اینکه دسترسی ابجکت  به ابجکت بگیریم در کلاس هلو 

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getCardDrive() {
		return cardDrive;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
	
	

}
