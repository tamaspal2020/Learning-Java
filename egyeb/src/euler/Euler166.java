package euler;
// egyenes számsort generálni, tomb minden variációt végigvinni, közben az adott összegeket nézni
public class Euler166 {
public static int[] tomb=new int[16];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i1=0; i1<10; i1++) {
			for (int i2=0; i2<10; i2++) {
				for (int i3=0; i3<10; i3++) {
					for (int i4=0; i4<10; i4++) {
						for (int i5=0; i5<10; i5++) {
							for (int i6=0; i6<10; i6++) {
								for (int i7=0; i7<10; i7++) {
									for (int i8=0; i8<10; i8++) {
										for (int i9=0; i9<10; i9++) {
											for (int i10=0; i10<10; i10++) {
												for (int i11=0; i11<10; i11++) {
													for (int i12=0; i12<10; i12++) {
														for (int i13=0; i13<10; i13++) {
															for (int i14=0; i14<10; i14++) {
																for (int i15=0; i15<10; i15++) {
																	for (int i16=0; i6<10; i16++) {
																		tomb[0]=i1; tomb[1]=i2; tomb[2]=i3; tomb[3]=i4;
																		tomb[4]=i5; tomb[5]=i6; tomb[6]=i7; tomb[7]=i8;
																		tomb[8]=i9; tomb[9]=i10; tomb[10]=i11; tomb[11]=i12;
																		tomb[12]=i13; tomb[13]=i14; tomb[14]=i15; tomb[15]=i16;
																		int a=(tomb[0]+tomb[1]+tomb[2]+tomb[3]);
																		if(
																				(a==tomb[4]+tomb[5]+tomb[6]+tomb[7]) && 
																				(a==tomb[8]+tomb[9]+tomb[10]+tomb[11]) && 
																				(a==tomb[12]+tomb[13]+tomb[14]+tomb[15]) && 
																				(a==tomb[0]+tomb[4]+tomb[8]+tomb[12]) &&   /// oszlopok
																				(a==tomb[1]+tomb[5]+tomb[9]+tomb[13]) &&  
																				(a==tomb[2]+tomb[6]+tomb[10]+tomb[14]) &&  
																				(a==tomb[3]+tomb[7]+tomb[11]+tomb[15]) &&  
																				
																				(a==tomb[0]+tomb[5]+tomb[10]+tomb[15]) &&  
																				(a==tomb[12]+tomb[9]+tomb[6]+tomb[3]) 
																				
																				)
																		
																		{
																			System.out.println(tomb[0]+","+tomb[1]+","+tomb[2]+","+tomb[3]);
																			System.out.println(tomb[4]+","+tomb[5]+","+tomb[6]+","+tomb[7]);
																			System.out.println(tomb[8]+","+tomb[9]+","+tomb[10]+","+tomb[11]);
																			System.out.println(tomb[12]+","+tomb[13]+","+tomb[14]+","+tomb[15]);
																		}
																			
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
			
	}


