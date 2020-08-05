package tablets;

import java.util.Hashtable;

public class Tablet {
private int resX;
private int resY;
private boolean vankamera;
private boolean vangps;
private double andoidver;
private int ar;

public Tablet(int resx, int resy, boolean kamera, boolean gps, double android, int ar) {
	this.ar=ar;
	this.andoidver=android;
	this.resX=resx;
	this.resY=resy;
	this.vankamera=kamera;
	this.vangps=gps;
}
public Tablet(int resx, int resy,  double android, int ar) {
	this.ar=ar;
	this.andoidver=android;
	this.resX=resx;
	this.resY=resy;
	this.vankamera=false;
	this.vangps=false;
}
public Tablet(int ar) {
	this.ar=ar;
	
}
public int getresX() {
	return this.resX;
}
public int getresY() {
	return this.resY;
}	
public boolean getkamera() {
	return this.vankamera;
}
public boolean getgps() {
	return this.vangps;
}
public double getandroid() {
	return this.andoidver;
}
public int getar() {
	return this.ar;
}
}
