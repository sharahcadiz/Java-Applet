import java.awt.*;
import java.applet.*;
import java.applet.AudioClip;

public class Randy extends Applet{
	public void paint(Graphics r) {

		//head and arms
		Color myYellow4 = Color.decode("#9C6405"); //dark yellow in shadow
		Color myYellow3 = Color.decode("#FFBF15"); // yellow orange
		Color myYellow2 = Color.decode("#FEDA3B"); //lighter yellow
		Color myYellow = Color.decode("#FFFA9E"); //lightest yellow
		Color brown = Color.decode("#B76F0B"); //lightest yellow in shadow (brown)

		//body and hands
		Color darkTeal = Color.decode("#345B6A"); //dark blue shadow
		Color Teal = Color.decode("#6EA9B7"); //light blue
		Color skyBlue = Color.decode("#8BC7DF"); //lighter blue
		Color darkskyBlue = Color.decode("#528090");//lighter blue in shadow
		Color skyBlue2 = Color.decode("#EFFDFF"); //lightest reflection of blue

		//vest
		Color myRed = Color.decode("#701328"); //darker pink for shadow
		Color myPink = Color.decode("#D21D60"); //dark pink
		Color myPink2 = Color.decode("#EB3F87"); //light pink
		Color myPink3 = Color.decode("#FF9AD4"); //lightest pink

		//joints
		Color Purple = Color.decode("#2E2540"); //dark purple
		Color Purple2 = Color.decode("#5F4B93"); //light purple
		Color Purple3 = Color.decode("#836EBB"); //lighter purple
		Color Purple4 = Color.decode("#CCBEF1"); //lightest purple

		//chest
		Color myMagenta = Color.decode("#6B1775"); //dark magenta
		Color myMagenta2 = Color.decode("#8B2F9C"); //light magenta
		Color myMagenta3 = Color.decode("#DC0EF7"); //lightest magenta

		//lower body
		Color darkPurple = Color.decode("#40253E"); //darkest purple of the hip
		Color darkPurple2 = Color.decode("#2F263B"); //dark purple of the hips
		Color darkPurple3 = Color.decode("#423560"); //light reflection in the hip joints

		Color myBlue = Color.decode("#A5C2DE"); //background


		Font courage = new Font("Comical Cartoon", Font.BOLD, 22);
		Font tcd = new Font("Comical Cartoon", Font.BOLD, 10);

		//cartoon network logo
		Font SC = new Font("Cartoon Slam", Font.BOLD, 55);
		Font Name = new Font("Cartoon Slam", Font.BOLD,13);
		Font RR = new Font ("Hendrickson", Font.PLAIN,45);

		AudioClip mysound = getAudioClip(getDocumentBase(),"Courage.wav");
		mysound.play();

		r.setColor(myBlue);
		r.fillRect(50,20,780,920); //bg

		r.setColor(myPink3);
		r.fillArc(50,315,780,1250,0,180);

		r.setColor(Color.black);
		r.fillRect(680,50,60,60);
		r.setColor(Color.white);
		r.fillRect(740,50,60,60);
		r.setFont(SC);
		r.drawString("S",690,100);
		r.setColor(Color.black);
		r.setFont(SC);
		r.drawString("C",747,100);
		r.setFont(Name);
		r.drawString("SHARAH CADIZ",680,123);//name
		r.setFont(RR);
		r.drawString("Robot Randy",690,890);//char name

		//logo
       r.setColor(Color.black);
       r.setFont(courage);
       r.drawString("COURAGE",70,92);
       r.setFont(tcd);
       r.drawString("THE COWARDLY DOG",70,120);

       r.setColor(Color.red);
       r.setFont(courage);
       r.drawString("COURAGE",68,90);
       r.setColor(Color.green);
       r.setFont(tcd);
       r.drawString("THE COWARDLY DOG",68,118);


		r.setColor(Color.black);
		r.fillArc(352,388,156,123,180,-180);
		r.setColor(myYellow);
		r.fillArc(355,390,150,115,180,-180);//head

		r.setColor(myYellow3);
		r.fillArc(355,395,150,105,180,-180);
		r.setColor(myYellow2);
		r.fillArc(395,370,65,65,0,-180);
		r.fillArc(397,395,65,15,0,180);
		r.setColor(myYellow);
		r.fillOval(415,390,25,25);//light reflection on head
		r.setColor(myYellow4);
		r.fillArc(355,430,150,28,0,180);

		r.setColor(Color.black);
		r.fillOval(508,442,85,75);//right shoulder outline
		r.fillOval(268,438,85,85);//left shoulder outline

		r.setColor(Purple3);
		r.fillOval(510,445,80,70);//right shoulder
		r.fillOval(270,440,80,80);//left shoulder

		r.setColor(Purple2);
		r.fillOval(270,447,67,65);
		r.setColor(Purple);
		r.fillOval(270,464,55,45);
		r.setColor(Purple4);
		r.fillArc(300,440,25,8,0,180);//left shoulder reflection

		r.setColor(Purple2);
		r.fillOval(525,450,65,60);
		r.setColor(Purple);
		r.fillOval(540,460,50,47);
		r.setColor(Purple4);
		r.fillArc(538,445,25,6,0,180);//right shoulder reflection

		//left arm
		r.setColor(Color.black);
		int e[] = {278,302,272,248};
		int f[] = {495,500,560,560};
		r.fillOval(278,488,22,27);
		r.fillPolygon(e,f,4);

		r.setColor(myYellow4);
		int e1[] = {280,300,270,250};
		int f1[] = {495,500,560,560};
		r.fillPolygon(e1,f1,4);
		r.fillOval(280,490,18,23);

		r.setColor(myYellow3);
		int E1[] = {273,287,265,250};
		int F1[] = {510,515,560,560};
		r.fillPolygon(E1,F1,4);
		r.setColor(brown);
		int E2[] = {287,292,285,280};
		int F2[] = {498,498,513,511};
		r.fillPolygon(E2,F2,4);
		r.setColor(myYellow);
		int E3[] = {280,285,264,255};
		int F3[] = {511,513,560,560};
		r.fillPolygon(E3,F3,4); //left arm reflection

		r.setColor(Color.black);
		r.fillOval(208,538,84,84);
		r.setColor(Purple3);
		r.fillOval(210,540,80,80);//left elbow

		r.setColor(Purple2);
		r.fillOval(210,548,70,65);
		int r1[] = {272,280,277,260};
		int r2[] = {546,550,570,570};
		r.fillPolygon(r1,r2,4);
		r.setColor(Purple4);
		r.fillArc(240,540,25,8,0,180);
		r.setColor(Purple);
		r.fillOval(213,565,60,55);
		r.fillArc(253,540,31,75,50,-190);
		r.fillOval(236,600,35,20);//left elbow reflection

		r.setColor(Color.black);
		int e2[] = {231,253,233,209};
		int f2[] = {605,610,655,650};
		r.fillPolygon(e2,f2,4);
		r.fillOval(231,598,22,24);

		r.setColor(myYellow4);
		int e3[] = {233,250,231,211};
		int f3[] = {605,610,655,650};
		r.fillPolygon(e3,f3,4);
		r.fillOval(233,600,18,20);

		r.setColor(myYellow3);
		int E4[] = {226,235,222,212};
		int F4[] = {618,620,655,650};
		r.fillPolygon(E4,F4,4);
		r.setColor(myYellow);
		int E5[] = {231,235,222,217};
		int F5[] = {620,620,655,650};
		r.fillPolygon(E5,F5,4);
		r.setColor(brown);
		int E6[] = {235,240,235,231};
		int F6[] = {608,608,620,620};
		r.fillPolygon(E6,F6,4);//left wrist reflection

		r.setColor(Color.black);
		r.fillOval(195,638,47,44);
		r.setColor(Purple2);
		r.fillOval(197,640,43,40);//left wrist

		r.setColor(Purple);
		r.fillOval(197,650,43,25);
		r.fillArc(225,643,15,30,90,-180);
		r.setColor(Purple3);
		r.fillOval(210,640,13,8);
		r.setColor(Purple4);
		r.fillOval(212,640,8,5);//left wrist joint reflection

		r.setColor(Color.black);
		r.fillArc(128,658,130,155,90,180);
		r.fillOval(128,658,134,134);
		r.setColor(skyBlue);
		r.fillArc(130,660,125,150,90,180);//left claws
		r.fillOval(130,660,130,130);

		r.setColor(Teal);
		r.fillOval(130,668,130,120);
		r.fillArc(131,687,118,120,90,180);
		r.setColor(darkTeal);
		r.fillOval(145,695,95,95);
		r.fillArc(133,695,118,115,90,180);
		r.fillArc(142,661,118,128,45,-180);

		r.setColor(darkTeal);
		r.fillArc(180,659,35,35,55,-180);
		int lcs[] = {190,195,210,200};
		int lcs2[] = {686,686,710,710};
		r.fillPolygon(lcs,lcs2,4);//claw line shadow

		r.setColor(Color.black);
		int xclawLine[] = {190,202,184,195,175,186,172,192};
		int yclawLine[] = {688,719,715,742,740,770,770,810};
		r.drawPolyline(xclawLine,yclawLine,8);
		int xline[] = {180,192};
		int yline[] = {787,790};
		r.drawPolyline(xline,yline,2);
		r.fillArc(180,656,35,35,55,-180);
		r.setColor(Teal);
		r.fillArc(179,657,34,32,55,-180);//left claw lines
		r.setColor(skyBlue2);
		r.fillArc(178,660,35,8,0,180);
		int llr[] = {184,187,194};
		int llr2[] = {686,686,700};
		r.fillPolygon(llr,llr2,3);//left claw reflection


		//right arm
		r.setColor(Color.black);
		int g[] = {558,582,617,593};
		int h[] = {500,500,560,560};
		r.fillPolygon(g,h,4);
		r.fillOval(558,493,27,31);
		r.setColor(myYellow4);
		int g1[] = {560,580,615,595};
		int h1[] = {500,500,560,560};
		r.fillPolygon(g1,h1,4);
		r.fillOval(560,495,23,27);

		r.setColor(myYellow3);
		int gs[] = {576,588,613,602};
		int hs[] = {513,515,560,560};
		r.fillPolygon(gs,hs,4);
		r.setColor(myYellow);
		int gs2[] = {576,582,608,602};
		int hs2[] = {513,515,560,560};
		r.fillPolygon(gs2,hs2,4);
		r.setColor(brown);
		int gs3[] = {570,575,582,576};
		int hs3[] = {500,500,515,513};
		r.fillPolygon(gs3,hs3,4);//right arm reflection


		r.setColor(Color.black);
		r.fillOval(578,538,84,84);
		r.setColor(Purple2);
		r.fillOval(580,540,80,80);//right elbow

		r.setColor(Purple);
		r.fillOval(593,565,65,55);
		r.fillArc(580,540,60,80,130,180);
		r.setColor(Purple3);
		r.fillArc(600,540,40,15,0,180);
		r.setColor(Purple4);
		r.fillArc(610,540,20,8,0,180);

		r.setColor(Color.black);
		int g2[] = {621,642,667,648};
		int h2[] = {613,605,650,658};
		r.fillPolygon(g2,h2,4);
		r.fillOval(621,598,23,24);

		r.setColor(myYellow4);
		int g3[] = {623,640,665,650};
		int h3[] = {613,605,650,658};
		r.fillPolygon(g3,h3,4);
		r.fillOval(623,600,19,20);

		r.setColor(myYellow3);
		int gs4[] = {636,646,665,655};
		int hs4[] = {619,616,655,650};
		r.fillPolygon(gs4,hs4,4);
		r.setColor(myYellow);
		int gs5[] = {636,640,658,652};
		int hs5[] = {619,617,655,650};
		r.fillPolygon(gs5,hs5,4);
		r.setColor(brown);
		int gs6[] = {629,634,640,635};
		int hs6[] = {608,605,617,619};
		r.fillPolygon(gs6,hs6,4);//right wrist reflection

		r.setColor(Color.black);
		r.fillOval(638,638,47,44);
		r.setColor(Purple2);
		r.fillOval(640,640,43,40);//right wrist

		r.setColor(Purple);
		r.fillArc(645,650,45,40,0,180);
		r.fillArc(640,640,43,40,135,180);
		r.setColor(Purple3);
		r.fillArc(650,640,20,8,0,180);
		r.setColor(Purple4);
		r.fillOval(655,640,8,5);//right wrist joint reflection

		r.setColor(Color.black);
		r.fillOval(618,658,134,134);
		r.fillArc(616,658,136,154,100,-190);
		r.setColor(Teal);
		r.fillOval(620,660,130,130);
		r.fillArc(620,660,130,150,100,-190);//right claw

		r.setColor(darkTeal);
		r.fillArc(620,660,130,130,115,180);
		r.setColor(Teal);
		r.fillArc(630,660,100,90,0,1800);
		r.setColor(darkTeal);
		r.fillOval(650,695,100,95);
		r.fillArc(635,700,100,110,90,-180);
		r.fillArc(655,695,90,110,90,-180);

		r.fillArc(653,662,35,35,120,180);
		int rcs[] = {672,676,679,674};
		int rcs2[] = {690,690,710,710};
		r.fillPolygon(rcs,rcs2,4);//right claw line shadow

		r.setColor(Color.black);
		r.fillArc(653,658,35,35,120,180);
		r.setColor(Teal);
		r.fillArc(655,659,34,32,120,180);

		r.setColor(skyBlue);
		r.fillArc(657,660,55,18,0,180);
		r.setColor(skyBlue2);
		r.fillArc(663,661,35,10,0,160);
		int rr[] = {680,682,679};
		int rr2[] = {690,690,710};
		r.fillPolygon(rr,rr2,3);//right claw ref

		r.setColor(Color.black);
		int rclawLinex[] = {677,680,692,688,702,692,708,685};
		int rclawLiney[] = {690,720,710,740,733,769,759,810};
		r.drawPolyline(rclawLinex,rclawLiney,8);
		int xrline[] = {685,695};
		int yrline[] = {790,788};
		r.drawPolyline(xrline,yrline,2);//right claw lines

		//body
		r.setColor(darkTeal);
		r.fillRect(320,460,220,270);
		r.fillArc(350,460,250,100,90,180);
		r.setColor(Color.black);
		r.fillArc(324,437,212,45,180,-180);//upper curve outline
		r.fillArc(278,447,132,330,90,180);//left curve outline
		r.fillArc(455,447,132,330,90,-180);//right curve outline
		r.setColor(darkTeal);
		r.fillArc(325,440,210,40,180,-180);//upper curve
		r.fillArc(280,450,130,325,90,180);//left curve
		r.fillArc(455,450,130,325,90,-180); //right curve

		r.setColor(Teal);
		int v[] = {300,322,300};
		int z[] = {500,460,500};
		r.fillPolygon(v,z,3);
		r.fillArc(290,470,80,250,90,180);
		r.fillArc(495,470,80,250,90,-180);
		r.fillRect(322,480,220,200);

		r.setColor(myPink);
		int v1[] ={322,540,528,325};
		int z1[] = {460,457,542,542};
		r.fillPolygon(v1,z1,4);
		r.fillArc(488,453,75,110,90,-180);
		int v2[] = {540,538,565};
		int z2[] = {457,541,500};
		r.fillPolygon(v2,z2,3);
		r.fillArc(297,458,65,180,90,180);
		r.fillArc(324,439,213,42,180,-180);//upper vest

		r.setColor(myPink3);
		r.fillArc(323,439,215,45,0,180);
		r.setColor(myPink2);
		r.fillArc(315,442,235,55,0,180);
		r.setColor(myPink);
		r.fillArc(308,455,250,55,0,180);//vest reflection


		r.setColor(Color.black);
		int vvb[] = {560,523,530,575};
		int zzb[] = {490,541,570,520};
		r.fillPolygon(vvb,zzb,4);//right vest outline
		int vvb2[] = {304,334,328,300};
		int zzb2[] = {489,541,580,530};
		r.fillPolygon(vvb2,zzb2,4);//left vest outline
		r.fillArc(318,526,218,52,0,180);

		r.setColor(darkTeal);
		r.fillArc(320,528,215,48,0,180);
		int vv2[] = {562,525,525,575};
		int zz2[] = {490,541,580,530};
		r.fillPolygon(vv2,zz2,4);
		int vv3[] = {302,332,332,290};
		int zz3[] = {489,541,650,630};
		r.fillPolygon(vv3,zz3,4);//upper vest shadow

		r.setColor(Teal);
		r.fillArc(320,530,210,50,0,180);
		int vvv2[] = {564,525,525,575};
		int zzz2[] = {497,547,580,530};
		r.fillPolygon(vvv2,zzz2,4);
		int vvv3[] = {302,332,332,292};
		int zzz3[] = {493,545,650,632};
		r.fillPolygon(vvv3,zzz3,4);
		r.fillArc(290,495,30,170,90,180);

		r.setColor(Color.black);
		int vb[] = {395,430,465};
		int zb[] = {440,460,440};
		r.fillPolygon(vb,zb,3);
		r.setColor(skyBlue);
		int vv[] = {397,430,462};
		int zz[] = {440,458,440};
		r.fillPolygon(vv,zz,3);
		r.setColor(skyBlue2);
		r.fillArc(400,440,45,7,0,180);//collar
		//upper vest

		r.setColor(darkTeal);
		r.fillOval(302,635,261,170);//body shadow

		r.setColor(Color.black);
		int v3b[] = {363,497,492,368};
		int z3b[] = {530,530,670,670};
		r.fillPolygon(v3b,z3b,4);//lower vest outline

		int v3bline[] = {492,490,510};
		int z3bline[] = {620,670,675};
		r.fillPolygon(v3bline,z3bline,3);
		int v4bline[] = {370,370,346};
		int z4bline[] = {620,670,675};
		r.fillPolygon(v4bline,z4bline,3);

		r.setColor(myPink);
		int v3[] = {365,495,490,370};
		int z3[] = {500,500,670,670};
		r.fillPolygon(v3,z3,4);
		int v4[] = {370,370,348};
		int z4[] = {620,670,680};
		r.fillPolygon(v4,z4,3);
		int v5[] = {490,490,508};
		int z5[] = {620,670,675};
		r.fillPolygon(v5,z5,3);//r lower vest

		r.setColor(Color.black);
		r.fillArc(348,572,20,80,90,-180);
		r.fillArc(493,573,20,80,90,180);
		r.setColor(Teal);
		r.fillArc(348,569,19,79,90,-180);
		r.fillArc(494,570,19,79,90,180);
		r.setColor(myPink2);
		r.fillOval(400,497,60,110);


		r.setColor(Color.black);
		r.fillArc(348,458,169,17,0,180);
		int xchestb[] = {348,517,512,353};
		int ychestb[] = {465,465,520,520};
		r.fillPolygon(xchestb,ychestb,4);//chest pad outline
		r.setColor(myMagenta);
		r.fillArc(350,460,165,15,0,180);
		int xchest[] = {350,515,510,355};
		int ychest[] = {465,465,520,520};
		r.fillPolygon(xchest,ychest,4);
		r.setColor(Color.black);
		r.fillArc(352,513,162,17,0,180);
		r.setColor(myPink);
		r.fillArc(353,515,160,15,0,180);//chest pad
		r.setColor(myPink2);
		r.fillArc(405,466,50,100,0,-180);


		r.setColor(skyBlue);
		int xvs[] = {290,317,332,363,363,292};
		int yvs[] = {580,523,545,534,545,635};
		r.fillPolygon(xvs,yvs,6);
		int xvs2[] = {325,365,365,340,326,320};
		int yvs2[] = {670,600,570,600,635,675};
		r.fillPolygon(xvs2,yvs2,6);
		int xvs3[] = {496,494,574,572};
		int yvs3[] = {570,610,610,550};
		r.fillPolygon(xvs3,yvs3,4);
		r.fillArc(496,555,80,30,0,180);
		r.fillArc(508,549,73,30,0,180);
		r.fillArc(525,545,55,30,0,180);
		r.fillArc(538,545,45,40,0,180);

		r.setColor(Teal);
		r.fillArc(495,602,80,20,0,180);
		r.fillArc(530,580,52,22,150,-180);
		r.setColor(skyBlue2);
		r.fillArc(297,503,8,150,45,100);
		r.fillArc(560,508,8,70,90,-180);

		r.setColor(darkskyBlue);
		int brs[] = {280,290,292,282};
		int brs2[] = {605,580,635,655};
		r.fillPolygon(brs,brs2,4);
		int brs3[] = {572,581,585,574};
		int brs4[] = {547,549,618,610};
		r.fillPolygon(brs3,brs4,4);
		r.setColor(darkTeal);
		int brs5[] = {573,582,584,574};
		int brs6[] = {583,587,603,596};
		r.fillPolygon(brs5,brs6,4);//body reflection


		r.setColor(myPink3);
		int xpr[] = {365,372,368};
		int ypr[] = {530,532,605};
		r.fillPolygon(xpr,ypr,3);
		int xpr2[] = {495,488,492};
		int ypr2[] = {530,532,605};
		r.fillPolygon(xpr2,ypr2,3);//vest sides reflection
		r.setColor(myRed);
		r.fillArc(354,630,152,70,0,180);
		int lv[] = {363,499,510,348};
		int lv2[] = {647,648,675,675};
		r.fillPolygon(lv,lv2,4);//lower vest shadow


		r.setColor(Color.black);
		r.fillArc(352,495,162,17,0,180);
		r.fillArc(352,477,162,17,0,180);
		r.setColor(myMagenta);
		r.fillArc(353,497,160,15,0,180);
		r.fillArc(353,479,160,15,0,180);
		r.setColor(Color.black);
		int chestline[] = {376,381};
		int chestline2[] = {462,517};
		r.drawPolyline(chestline,chestline2,2);
		int chestline3[] = {404,407};
		int chestline4[] = {461,516};
		r.drawPolyline(chestline3,chestline4,2);
		int chestline5[] = {432,432};
		int chestline6[] = {460,515};
		r.drawPolyline(chestline5,chestline6,2);
		int chestline7[] = {460,458};
		int chestline8[] = {461,516};
		r.drawPolyline(chestline7,chestline8,2);
		int chestline9[] = {488,486};
		int chestline10[] = {462,517};
		r.drawPolyline(chestline9,chestline10,2);//chest pad lines


		r.setColor(myMagenta2);
		r.fillRect(357,465,17,14);
		r.fillRect(357,484,17,12);
		r.fillRect(357,503,17,12);//1st vertical line lighter shade
		r.fillRect(382,463,17,14);
		r.fillRect(383,480,17,14);
		r.fillRect(385,499,17,14);//2nd
		r.fillRect(410,461,17,14);
		r.fillRect(410,479,17,14);
		r.fillRect(410,497,17,14);//3rd
		r.fillRect(438,461,17,14);
		r.fillRect(438,479,17,14);
		r.fillRect(438,497,17,14);//4th
		r.fillRect(465,462,17,14);
		r.fillRect(465,481,17,14);
		r.fillRect(465,499,17,14);//5th
		r.fillRect(493,465,17,14);
		r.fillRect(492,484,17,12);
		r.fillRect(492,503,17,12);//6th
		//chest lighter reflection

		r.setColor(myMagenta3);
		r.fillOval(360,465,10,5);
		r.fillOval(360,484,10,5);
		r.fillOval(360,503,10,5);//1st vertical line lightest shade
		r.fillOval(385,463,10,5);
		r.fillOval(386,480,10,5);
		r.fillOval(388,499,10,5);//2nd
		r.fillOval(413,461,10,5);
		r.fillOval(413,479,10,5);
		r.fillOval(413,497,10,5);//3rd
		r.fillOval(441,461,10,5);
		r.fillOval(441,479,10,5);
		r.fillOval(441,497,10,5);//4th
		r.fillOval(468,462,10,5);
		r.fillOval(468,481,10,5);
		r.fillOval(468,499,10,5);//5th
		r.fillOval(496,465,10,5);
		r.fillOval(495,484,10,5);
		r.fillOval(495,503,10,5);
		//chest lightest Reflection

		r.setColor(Color.black);
		r.fillOval(308,654,246,163);//hips outline
		r.setColor(darkPurple);
		r.fillOval(311,657,240,158);//hips

		r.setColor(Color.black);
		r.fillOval(343,713,64,64);
		r.setColor(darkPurple2);
		r.fillOval(345,715,60,60);//left hip joint

		r.setColor(darkPurple3);
		int x[] = {360,390,376,373};
		int y[] = {720,720,745,745};
		r.fillPolygon(x,y,4);
		r.fillArc(358,715,35,15,0,180);

		r.setColor(Color.black);
		r.fillOval(458,713,64,64);
		r.setColor(darkPurple2);
		r.fillOval(460,715,60,60);//right hip joint

		r.setColor(darkPurple3);
		int x1[] = {475,505,491,488};
		int y1[] = {720,720,745,745};
		r.fillPolygon(x1,y1,4);
		r.fillOval(472,715,35,15);

		r.setColor(Color.black);
		int a1[] = {363,382,377,348};
		int b1[] = {760,760,850,850};
		r.fillPolygon(a1,b1,4);
		r.setColor(myYellow4);
		int a[] = {365,380,375,350};
		int b[] = {760,760,850,850};
		r.fillPolygon(a,b,4);

		r.setColor(Color.black);
		r.fillArc(363,754,18,18,0,180);
		r.fillOval(323,838,79,79);
		r.setColor(myYellow4);
		r.fillArc(365,756,15,15,0,180);

		r.setColor(myYellow3);
		int as[] = {358,370,367,352};
		int bs[] = {810,808,838,839};
		r.fillPolygon(as,bs,4);
		r.setColor(myYellow);
		int as2[] = {365,370,367,361};
		int bs2[] = {810,808,838,839};
		r.fillPolygon(as2,bs2,4);
		r.setColor(brown);
		int as3[] = {370,375,370,365};
		int bs3[] = {760,760,810,810};
		r.fillPolygon(as3,bs3,4); //left lap reflection & shadow


		r.setColor(Purple2); //left knee
		r.fillOval(325,840,75,75);

		r.setColor(Purple);
		r.fillArc(370,848,30,60,90,-180);
		r.setColor(Purple2);
		r.fillArc(380,847,10,30,90,-180);
		r.setColor(Purple);
		r.fillOval(329,862,65,56);
		r.fillOval(325,862,60,45);// dark shadow on left knee
		r.setColor(Purple3);
		r.fillArc(342,840,40,15,0,190);
		r.setColor(Purple4);
		r.fillOval(348 ,842,15,5);//light reflect on left knee

		r.setColor(Color.black);
		int a3[] = {346,375,372,338};
		int b3[] = {900,900,940,940};
		r.fillPolygon(a3,b3,4);
		r.fillArc(346,893,29,17,0,180);

		r.setColor(myYellow4);
		int a2[] = {348,373,370,340};
		int b2[] = {900,900,940,940};
		r.fillPolygon(a2,b2,4);
		r.fillArc(348,895,25,15,0,180);
		r.setColor(myYellow3);
		int A2[] = {345,372,370,340};
		int B2[] = {920,925,940,940};
		r.fillPolygon(A2,B2,4);
		r.fillArc(342,915,30,30,0,180);
		r.setColor(myYellow);
		int A3[] = {353,358,355,350};
		int B3[] = {917,916,940,940};
		r.fillPolygon(A3,B3,4);
		r.setColor(brown);
		int A4[] = {355,360,358,353};
		int B4[] = {900,900,916,915};
		r.fillPolygon(A4,B4,4); //left leg reflection
		//left leg


		r.setColor(Color.black);
		r.fillArc(484,754,18,18,0,180);
		int c[] = {482,502,517,488};
		int d[] = {760,760,850,850};
		r.fillPolygon(c,d,4);

		r.setColor(myYellow4);
		r.fillArc(486,756,15,15,0,180);
		int c1[] = {485,500,515,490};
		int d1[] = {760,760,850,850};
		r.fillPolygon(c1,d1,4);

		r.setColor(brown);
		int cs3[] = {489,494,500,495};
		int ds3[] = {760,760,810,810};
		r.fillPolygon(cs3,ds3,4);
		r.setColor(myYellow3);
		int cs[] = {495,508,513,500};
		int ds[] = {805,808,838,839};
		r.fillPolygon(cs,ds,4);
		r.setColor(myYellow);
		int cs2[] = {495,500,505,498};
		int ds2[] = {805,807,838,839};
		r.fillPolygon(cs2,ds2,4); //right lap reflection

		r.setColor(Color.black);
		r.fillOval(463,838,79,79);
		r.setColor(Purple2);
		r.fillOval(465,840,75,75);//right knee

		r.setColor(Purple3);
		r.fillArc(485,840,35,15,0,180);
		r.setColor(Purple4);
		r.fillArc(495,840,20,8,0,180);
		r.setColor(Purple);
		r.fillArc(465,848,30,60,90,180);
		r.setColor(Purple2);
		r.setColor(Purple);
		r.fillOval(467,859,70,56);//right knee reflection


		r.setColor(Color.black);
		int c2[] = {493,522,529,495};
		int d2[] = {900,900,940,940};
		r.fillPolygon(c2,d2,4);
		r.fillArc(493,893,29,17,0,180);

		r.setColor(myYellow4);
		int c3[] = {495,520,527,497};
		int d3[] = {900,900,940,940};
		r.fillPolygon(c3,d3,4);
		r.fillArc(496,895,25,15,0,180);
		//right leg

		r.setColor(myYellow3);
		int cs4[] = {496,522,527,497};
		int ds4[] = {920,916,940,940};
		r.fillPolygon(cs4,ds4,4);
		r.fillArc(496,912,30,30,0,180);
		r.setColor(myYellow);
		int cs5[] = {507,512,515,510};
		int ds5[] = {913,913,940,940};
		r.fillPolygon(cs5,ds5,4);
		r.setColor(brown);
		int cs6[] = {506,511,513,508};
		int ds6[] = {898,898,913,913};
		r.fillPolygon(cs6,ds6,4);
	}

}