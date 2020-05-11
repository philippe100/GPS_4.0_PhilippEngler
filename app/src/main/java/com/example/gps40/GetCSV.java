package com.example.gps40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class GetCSV {
    private ArrayList<Haltestellen_Koordinaten> list =new ArrayList<Haltestellen_Koordinaten>();


    public String[] get() throws IOException
    {
       /* FileReader fileReader = new FileReader("CSV.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;

        while ((line = bufferedReader.readLine()) != null)
        {
            lines.add(line);
        }

        bufferedReader.close();

        return lines.toArray(new String[lines.size()]);**/
       String tmpS = "111;Heumarkt;HMG;1;6.9604570988;50.9357563921;STRAB;1 7 9\n" +
               "112;Heumarkt;HMG;1;6.9595737676;50.9357045307;STRAB;1 7 9\n" +
               "113;Heumarkt;HMG;1;6.9574528147;50.9351045185;STRAB;5\n" +
               "114;Heumarkt;HMG;1;6.9579496548;50.9355407748;STRAB;5\n" +
               "121;Heumarkt;HMG;1;6.9603999897;50.9355099544;BUS;106 132 133\n" +
               "127;Heumarkt;HMG;1;6.9599835983;50.9346887422;BUS;106\n" +
               "128;Heumarkt;HMG;1;6.9599845938;50.9346887596;BUS;106\n" +
               "211;Neumarkt;NEU;2;6.9481136124;50.9357627630;STRAB;1 7 9\n" +
               "212;Neumarkt;NEU;2;6.9473082935;50.9358336859;STRAB;1 7 9\n" +
               "213;Neumarkt;NEU;2;6.9468885857;50.9363563084;STRAB;7\n" +
               "214;Neumarkt;NEU;2;6.9494666461;50.9346367732;STRAB;3 4 16 18\n" +
               "215;Neumarkt;NEU;2;6.9491003118;50.9354157645;STRAB;3 4 16 18\n" +
               "216;Neumarkt;NEU;2;6.9468885857;50.9363563084;STRAB;7\n" +
               "221;Neumarkt;NEU;2;6.9481527709;50.9356459925;BUS;136\n" +
               "222;Neumarkt;NEU;2;6.9480660414;50.9363260168;BUS;136\n" +
               "311;Poststr.;PSS;3;6.9500805214;50.9316916582;STRAB;3 4 16 18\n" +
               "312;Poststr.;PSS;3;6.9500954734;50.9312610285;STRAB;3 4 16 18\n" +
               "411;Mauritiuskirche;MAK;4;6.9450683908;50.9346873217;STRAB;9\n" +
               "412;Mauritiuskirche;MAK;4;6.9451253142;50.9335995359;STRAB;9\n" +
               "611;Rathaus;RAT;6;6.9595586023;50.9379333709;STRAB;5\n" +
               "612;Rathaus;RAT;6;6.9596292752;50.9384746818;STRAB;5\n" +
               "711;Appellhofplatz;APB;7;6.9505437660;50.9399234342;STRAB;3 4 16 18\n" +
               "712;Appellhofplatz;APB;7;6.9505501468;50.9393478547;STRAB;3 4 16 18\n" +
               "713;Appellhofplatz;APB;7;6.9507951268;50.9412155752;STRAB;5\n" +
               "714;Appellhofplatz;APB;7;6.9499755448;50.9411200617;STRAB;5\n" +
               "811;Dom/Hbf;DOM;8;6.9576248565;50.9418157999;STRAB;5 16 18\n" +
               "812;Dom/Hbf;DOM;8;6.9567097047;50.9417858452;STRAB;5 16 18\n" +
               "821;Dom/Hbf;DOM;8;6.9555079830;50.9416751374;BUS;172\n" +
               "822;Dom/Hbf;DOM;8;6.9555079830;50.9416751374;BUS;172\n" +
               "911;Breslauer Platz/Hbf;BRE;9;6.9586599639;50.9444659285;STRAB;16 18\n" +
               "912;Breslauer Platz/Hbf;BRE;9;6.9586930490;50.9443898802;STRAB;16 18\n" +
               "921;Breslauer Platz/Hbf;BRE;9;6.9606116226;50.9430989914;BUS;132\n" +
               "922;Breslauer Platz/Hbf;BRE;9;6.9606134201;50.9430969543;BUS;132\n" +
               "923;Breslauer Platz/Hbf;BRE;9;6.9609154370;50.9435115358;BUS;133\n" +
               "925;Breslauer Platz/Hbf;BRE;9;6.9610442053;50.9433698848;BUS;124\n" +
               "926;Breslauer Platz/Hbf;BRE;9;6.9609139155;50.9435105199;BUS;133\n" +
               "928;Breslauer Platz/Hbf;BRE;9;6.9610442053;50.9433698848;BUS;124\n" +
               "929;Breslauer Platz/Hbf;BRE;9;6.9606407382;50.9430907761;BUS;171\n" +
               "930;Breslauer Platz/Hbf;BRE;9;6.9606407382;50.9430907761;BUS;171\n" +
               "1021;Kuthstr./Vingst;KSV;10;7.0228043809;50.9331355959;BUS;179\n" +
               "1022;Kuthstr./Vingst;KSV;10;7.0227813148;50.9332029278;BUS;179\n" +
               "1111;Severinstr.;SEV;11;6.9579167704;50.9293389915;STRAB;3 4\n" +
               "1112;Severinstr.;SEV;11;6.9559721812;50.9290534899;STRAB;3 4\n" +
               "1113;Severinstr.;SEV;11;6.9573882085;50.9292416944;STRAB;17\n" +
               "1114;Severinstr.;SEV;11;6.9570669232;50.9292598154;STRAB;17\n" +
               "1115;Severinstr.;SEV;11;6.9575407742;50.9287153499;STRAB;17\n" +
               "1116;Severinstr.;SEV;11;6.9572230467;50.9287270580;STRAB;17\n" +
               "1121;Severinstr.;SEV;11;6.9573871242;50.9295392796;BUS;132\n" +
               "1122;Severinstr.;SEV;11;6.9571265041;50.9295629592;BUS;132\n" +
               "1221;Waidmarkt;WAI;12;6.9555167174;50.9325043414;BUS;132\n" +
               "1222;Waidmarkt;WAI;12;6.9562417103;50.9322837384;BUS;106 132\n" +
               "1321;Rosenstr.;ROS;13;6.9612804867;50.9269638930;BUS;132\n" +
               "1322;Rosenstr.;ROS;13;6.9588359928;50.9262832434;BUS;132\n" +
               "1421;Silbermöwenweg;SMW;14;6.8764385125;50.9664105452;BUS;143\n" +
               "1422;Silbermöwenweg;SMW;14;6.8769476425;50.9661868640;BUS;143\n" +
               "1521;Severinskirche;SVK;15;6.9615777821;50.9235360691;BUS;132\n" +
               "1522;Severinskirche;SVK;15;6.9604590972;50.9236032274;BUS;132\n" +
               "1711;Ubierring;UBI;17;6.9651667181;50.9223180656;STRAB;15 16\n" +
               "1712;Ubierring;UBI;17;6.9658583277;50.9224992035;STRAB;16\n" +
               "1713;Ubierring;UBI;17;6.9662680417;50.9218781274;STRAB;15\n" +
               "1721;Ubierring;UBI;17;6.9650497194;50.9217123633;BUS;133 142\n" +
               "1722;Ubierring;UBI;17;6.9647865626;50.9222549568;BUS;133\n" +
               "1811;Chlodwigplatz;CWP;18;6.9602598735;50.9212222388;STRAB;15 16\n" +
               "1812;Chlodwigplatz;CWP;18;6.9609706576;50.9213155120;STRAB;15 16\n" +
               "1813;Chlodwigplatz;CWP;18;6.9596617475;50.9215233297;STRAB;17\n" +
               "1814;Chlodwigplatz;CWP;18;6.9595015100;50.9210067134;STRAB;17\n" +
               "1821;Chlodwigplatz;CWP;18;6.9599431913;50.9204143684;BUS;132 133\n" +
               "1822;Chlodwigplatz;CWP;18;6.9594485954;50.9221801972;BUS;132\n" +
               "1824;Chlodwigplatz;CWP;18;6.9603112334;50.9213232372;BUS;133\n" +
               "1825;Chlodwigplatz;CWP;18;6.9605093999;50.9211843283;BUS;142\n" +
               "1911;Ulrepforte;ULR;19;6.9514371340;50.9243235691;STRAB;15 16\n" +
               "1912;Ulrepforte;ULR;19;6.9520783837;50.9240114048;STRAB;15 16\n" +
               "2011;Bonner Wall;ABW;20;6.9610329436;50.9164120165;STRAB;17\n" +
               "2012;Bonner Wall;ABW;20;6.9610956352;50.9159445350;STRAB;17\n" +
               "2021;Bonner Wall;ABW;20;6.9609071734;50.9170107846;BUS;106 132 142\n" +
               "2022;Bonner Wall;ABW;20;6.9607720770;50.9170027582;BUS;106 132 133 142\n" +
               "2111;Eifelplatz;EIF;21;6.9438902930;50.9235685025;STRAB;12\n" +
               "2112;Eifelplatz;EIF;21;6.9433225624;50.9231580063;STRAB;12\n" +
               "2211;Eifelstr.;EFS;22;6.9454459025;50.9268426563;STRAB;12 15 16\n" +
               "2212;Eifelstr.;EFS;22;6.9461806490;50.9264546433;STRAB;12 15 16\n" +
               "2311;Barbarossaplatz;BAB;23;6.9434074467;50.9291439767;STRAB;16 18\n" +
               "2312;Barbarossaplatz;BAB;23;6.9429223395;50.9288108426;STRAB;16 18\n" +
               "2313;Barbarossaplatz;BAB;23;6.9419120743;50.9291651078;STRAB;12 15\n" +
               "2314;Barbarossaplatz;BAB;23;6.9423455801;50.9288132683;STRAB;12 15\n" +
               "2411;Zülpicher Platz;ZPL;24;6.9404995694;50.9317527130;STRAB;12 15\n" +
               "2412;Zülpicher Platz;ZPL;24;6.9406373576;50.9313205637;STRAB;12 15\n" +
               "2413;Zülpicher Platz;ZPL;24;6.9403859897;50.9309153651;STRAB;9\n" +
               "2414;Zülpicher Platz;ZPL;24;6.9411004722;50.9313656077;STRAB;9\n" +
               "2511;Dasselstr./Bf Süd;DBS;25;6.9360885407;50.9284169787;STRAB;9\n" +
               "2512;Dasselstr./Bf Süd;DBS;25;6.9354740807;50.9281171415;STRAB;9\n" +
               "2611;Eifelwall;EFW;26;6.9371767780;50.9248730490;STRAB;18\n" +
               "2612;Eifelwall;EFW;26;6.9365548572;50.9244018430;STRAB;18\n" +
               "2621;Eifelwall;EFW;26;6.9370280024;50.9253313524;BUS;142\n" +
               "2622;Eifelwall;EFW;26;6.9366805825;50.9247474492;BUS;142\n" +
               "2711;Rudolfplatz;RDP;27;6.9404793641;50.9358564043;STRAB;1 7\n" +
               "2712;Rudolfplatz;RDP;27;6.9395917142;50.9362439318;STRAB;1 7\n" +
               "2713;Rudolfplatz;RDP;27;6.9390895103;50.9366504898;STRAB;12 15\n" +
               "2714;Rudolfplatz;RDP;27;6.9389856207;50.9360610912;STRAB;12 15\n" +
               "2721;Rudolfplatz;RDP;27;6.9397064678;50.9354768981;BUS;136\n" +
               "2722;Rudolfplatz;RDP;27;6.9393177889;50.9362873932;BUS;136\n" +
               "2811;Moltkestr.;MOL;28;6.9322876271;50.9355697577;STRAB;1 7\n" +
               "2812;Moltkestr.;MOL;28;6.9330677989;50.9365124540;STRAB;1 7\n" +
               "2821;Moltkestr.;MOL;28;6.9326915882;50.9352388355;BUS;136\n" +
               "2822;Moltkestr.;MOL;28;6.9325193837;50.9359860485;BUS;136\n" +
               "2921;Roonstr.;ROO;29;6.9340831982;50.9332666688;BUS;136\n" +
               "2922;Roonstr.;ROO;29;6.9338749952;50.9326496964;BUS;136\n" +
               "3011;Friesenplatz;FSP;30;6.9398331173;50.9405264475;STRAB;3 4 5\n" +
               "3012;Friesenplatz;FSP;30;6.9391187192;50.9406991097;STRAB;3 4 5\n" +
               "3013;Friesenplatz;FSP;30;6.9400803859;50.9408289550;STRAB;12 15\n" +
               "3014;Friesenplatz;FSP;30;6.9398724387;50.9402487838;STRAB;12 15\n" +
               "3021;Friesenplatz;FSP;30;6.9392196870;50.9405694030;BUS;172\n" +
               "3022;Friesenplatz;FSP;30;6.9392901095;50.9406829785;BUS;172\n" +
               "3111;Hans-Böckler-Platz/Bf West;HBP;31;6.9336574523;50.9432005148;STRAB;3 4 5\n" +
               "3112;Hans-Böckler-Platz/Bf West;HBP;31;6.9328921768;50.9435847619;STRAB;3 4 5\n" +
               "3121;Hans-Böckler-Platz/Bf West;HBP;31;6.9328022331;50.9435841585;BUS;172\n" +
               "3122;Hans-Böckler-Platz/Bf West;HBP;31;6.9324153314;50.9427846840;BUS;172\n" +
               "3211;Christophstr./Mediapark;CPH;32;6.9429220331;50.9450646778;STRAB;12 15\n" +
               "3212;Christophstr./Mediapark;CPH;32;6.9423110969;50.9446437049;STRAB;12 15\n" +
               "3321;Gewerbegebiet Feldkassel;GWF;33;6.9164252998;51.0395498137;BUS;124\n" +
               "3322;Gewerbegebiet Feldkassel;GWF;33;6.9164220215;51.0395497552;BUS;124\n" +
               "3411;Reichenspergerplatz;RPP;34;6.9653026372;50.9544052196;STRAB;16 18\n" +
               "3412;Reichenspergerplatz;RPP;34;6.9645368057;50.9541490394;STRAB;16 18\n" +
               "3421;Reichenspergerplatz;RPP;34;6.9646638743;50.9540499852;BUS;140\n" +
               "3422;Reichenspergerplatz;RPP;34;6.9642104260;50.9541821117;BUS;140\n" +
               "3423;Reichenspergerplatz;RPP;34;6.9634059519;50.9543019081;BUS;184\n" +
               "3511;Ebertplatz;EBP;35;6.9595370283;50.9510131543;STRAB;16 18\n" +
               "3512;Ebertplatz;EBP;35;6.9587841030;50.9504416606;STRAB;12 15\n" +
               "3513;Ebertplatz;EBP;35;6.9594277141;50.9510221261;STRAB;12 15\n" +
               "3514;Ebertplatz;EBP;35;6.9589515224;50.9504160774;STRAB;16 18\n" +
               "3521;Ebertplatz;EBP;35;6.9581308438;50.9508482666;BUS;127 140\n" +
               "3522;Ebertplatz;EBP;35;6.9577858722;50.9508414232;BUS;127 140\n" +
               "3611;Hansaring;HSR;36;6.9515505236;50.9487130848;STRAB;12 15\n" +
               "3612;Hansaring;HSR;36;6.9509157483;50.9485205409;STRAB;12 15\n" +
               "3621;Hansaring;HSR;36;6.9528130134;50.9498099842;BUS;127\n" +
               "3622;Hansaring;HSR;36;6.9534238954;50.9501418617;BUS;127\n" +
               "3721;Worringer Str.;WRR;37;6.9681693174;50.9553110776;BUS;140\n" +
               "3722;Worringer Str.;WRR;37;6.9679337845;50.9554680562;BUS;140 184\n" +
               "3821;Krefelder Wall;KFW;38;6.9504987617;50.9541346799;BUS;127\n" +
               "3822;Krefelder Wall;KFW;38;6.9504539007;50.9542610641;BUS;127\n" +
               "3911;Deutzer Freiheit;DZF;39;6.9714199447;50.9380485371;STRAB;1 9\n" +
               "3912;Deutzer Freiheit;DZF;39;6.9712969716;50.9374695408;STRAB;1 9\n" +
               "3913;Deutzer Freiheit;DZF;39;6.9708445797;50.9355284704;STRAB;7\n" +
               "3914;Deutzer Freiheit;DZF;39;6.9710765154;50.9360793222;STRAB;7\n" +
               "4011;Suevenstr.;SVS;40;6.9764936231;50.9328665266;STRAB;3 4\n" +
               "4012;Suevenstr.;SVS;40;6.9760646295;50.9325622955;STRAB;3 4\n" +
               "4111;Bf Deutz/Messe;BDM;41;6.9784139365;50.9396315280;STRAB;1 9\n" +
               "4112;Bf Deutz/Messe;BDM;41;6.9774044775;50.9398664071;STRAB;1 9\n" +
               "4121;Bf Deutz/Messe;BDM;41;6.9775909828;50.9395803096;BUS;150\n" +
               "4122;Bf Deutz/Messe;BDM;41;6.9762018584;50.9398321637;BUS;150\n" +
               "4211;Koelnmesse;MSO;42;6.9822732717;50.9435849398;STRAB;3 4\n" +
               "4212;Koelnmesse;MSO;42;6.9817534907;50.9432011861;STRAB;3 4\n" +
               "4411;Deutz Technische Hochschule;DZB;44;6.9859264567;50.9365857842;STRAB;1 9\n" +
               "4412;Deutz Technische Hochschule;DZB;44;6.9848447898;50.9369096884;STRAB;1 9\n" +
               "4421;Deutz Technische Hochschule;DZB;44;6.9863829665;50.9362949776;BUS;153 179\n" +
               "4422;Deutz Technische Hochschule;DZB;44;6.9856830287;50.9366063168;BUS;153 179\n" +
               "4511;Severinsbrücke;SVB;45;6.9723621637;50.9305708594;STRAB;7\n" +
               "4512;Severinsbrücke;SVB;45;6.9719837853;50.9310801684;STRAB;7\n" +
               "4611;Drehbrücke;DRE;46;6.9746938581;50.9286423345;STRAB;7\n" +
               "4612;Drehbrücke;DRE;46;6.9753832555;50.9282121606;STRAB;7\n" +
               "4712;Poller Kirchweg;PKI;47;6.9796708510;50.9239972353;STRAB;7\n" +
               "4713;Poller Kirchweg;PKI;47;6.9801659638;50.9236049520;STRAB;7\n" +
               "4821;Betzdorfer Str.;BTZ;48;6.9916487917;50.9357830208;BUS;153\n" +
               "4822;Betzdorfer Str.;BTZ;48;6.9915302618;50.9358780239;BUS;153\n" +
               "4911;Bf Deutz/LANXESS arena;BDK;49;6.9785784500;50.9392156282;STRAB;3 4\n" +
               "4912;Bf Deutz/LANXESS arena;BDK;49;6.9781826217;50.9386538595;STRAB;3 4\n" +
               "4921;Bf Deutz/LANXESS arena;BDK;49;6.9782481626;50.9382914675;BUS;153 196\n" +
               "4922;Bf Deutz/LANXESS arena;BDK;49;6.9782773476;50.9384127589;BUS;153 196\n" +
               "5021;Rotdornstr.;RTS;50;6.9979658310;50.8856528409;BUS;130\n" +
               "5022;Rotdornstr.;RTS;50;6.9980561122;50.8854108379;BUS;130\n" +
               "5121;Im Rheinpark;IRP;51;6.9750671091;50.9457966518;BUS;150\n" +
               "5122;Im Rheinpark;IRP;51;6.9751749000;50.9457666836;BUS;150\n" +
               "5211;Pohligstr.;POH;52;6.9415800881;50.9166833148;STRAB;12\n" +
               "5212;Pohligstr.;POH;52;6.9413176108;50.9162412262;STRAB;12\n" +
               "5221;Pohligstr.;POH;52;6.9411110781;50.9172166499;BUS;142\n" +
               "5223;Pohligstr.;POH;52;6.9408886405;50.9171825067;BUS;142\n" +
               "5311;Herthastr.;HTH;53;6.9408740165;50.9132147158;STRAB;12\n" +
               "5312;Herthastr.;HTH;53;6.9407309881;50.9127035017;STRAB;12\n" +
               "5411;Gottesweg;GOW;54;6.9415393127;50.9102247633;STRAB;12\n" +
               "5412;Gottesweg;GOW;54;6.9412935914;50.9098067132;STRAB;12\n" +
               "5421;Gottesweg;GOW;54;6.9410092708;50.9110271962;BUS;131\n" +
               "5422;Gottesweg;GOW;54;6.9409232163;50.9110043626;BUS;131\n" +
               "5521;Kappelsweg;KAW;55;6.8604499745;50.9774610487;BUS;126\n" +
               "5522;Kappelsweg;KAW;55;6.8605632811;50.9779960991;BUS;126\n" +
               "5611;Zollstockgürtel;HGW;56;6.9420620050;50.9057734927;STRAB;12\n" +
               "5612;Zollstockgürtel;HGW;56;6.9421167487;50.9052547046;STRAB;12\n" +
               "5621;Zollstockgürtel;HGW;56;6.9438970936;50.9047305350;BUS;130 131\n" +
               "5622;Zollstockgürtel;HGW;56;6.9437019440;50.9049144382;BUS;130 131\n" +
               "5711;Zollstock Südfriedhof;ZSF;57;6.9440833113;50.9009722356;STRAB;12\n" +
               "5712;Zollstock Südfriedhof;ZSF;57;6.9449361618;50.9009000167;STRAB;12\n" +
               "5721;Zollstock Südfriedhof;ZSF;57;6.9443310696;50.9010110464;BUS;131\n" +
               "5722;Zollstock Südfriedhof;ZSF;57;6.9463081726;50.9005943651;BUS;131\n" +
               "5723;Zollstock Südfriedhof;ZSF;57;6.9443310696;50.9010110464;BUS;133 138\n" +
               "5821;Zollstocksweg;ZSW;58;6.9458054924;50.9088278205;BUS;131\n" +
               "5822;Zollstocksweg;ZSW;58;6.9455144809;50.9089755930;BUS;131\n" +
               "5921;Roisdorfer Str.;RDS;59;6.9456246177;50.9053049938;BUS;131\n" +
               "5922;Roisdorfer Str.;RDS;59;6.9454610914;50.9059305138;BUS;131\n" +
               "6021;Kendenicher Str.;KDS;60;6.9372387630;50.9018305262;BUS;131 138\n" +
               "6022;Kendenicher Str.;KDS;60;6.9373221759;50.9017582511;BUS;131 138\n" +
               "6023;Kendenicher Str.;KDS;60;6.9369644196;50.9022225750;BUS;131\n" +
               "6024;Kendenicher Str.;KDS;60;6.9366634760;50.9016913848;BUS;131\n" +
               "6121;Oberer Komarweg;OKW;61;6.9314030285;50.8985546518;BUS;131 138\n" +
               "6122;Oberer Komarweg;OKW;61;6.9319395827;50.8987963826;BUS;138\n" +
               "6221;Brüggener Str.;BGG;62;6.9392863685;50.9052207713;BUS;131\n" +
               "6222;Brüggener Str.;BGG;62;6.9391268897;50.9051215414;BUS;131\n" +
               "6321;Bernkasteler Str.;BKA;63;6.9367102159;50.9066977316;BUS;130\n" +
               "6322;Bernkasteler Str.;BKA;63;6.9374727719;50.9063635987;BUS;130\n" +
               "6421;Rheinsteinstr.;REI;64;6.9596916524;50.9070721686;BUS;133\n" +
               "6422;Rheinsteinstr.;REI;64;6.9598241654;50.9073110222;BUS;133\n" +
               "6511;Schönhauser Str.;SHS;65;6.9717962172;50.9145492339;STRAB;16 17\n" +
               "6512;Schönhauser Str.;SHS;65;6.9720305271;50.9141436385;STRAB;16 17\n" +
               "6623;Marktstr.;BNT;66;6.9625082375;50.9118349353;BUS;132 133\n" +
               "6624;Marktstr.;BNT;66;6.9619949299;50.9120668271;BUS;132 133\n" +
               "6721;Koblenzer Str.;KBS;67;6.9674888485;50.9124277673;BUS;106\n" +
               "6722;Koblenzer Str.;KBS;67;6.9663416369;50.9127999129;BUS;106\n" +
               "6821;Tacitusstr.;TAC;68;6.9697665959;50.9092999774;BUS;106\n" +
               "6822;Tacitusstr.;TAC;68;6.9693999767;50.9098563410;BUS;106\n" +
               "6921;Mannsfeld;MAN;69;6.9629166291;50.9097443503;BUS;132\n" +
               "6922;Mannsfeld;MAN;69;6.9628420627;50.9096146173;BUS;132\n" +
               "6923;Mannsfeld;MAN;69;6.9618120917;50.9095343979;BUS;133\n" +
               "6924;Mannsfeld;MAN;69;6.9621249122;50.9099999833;BUS;133\n" +
               "7021;Cäsarstr.;CAE;70;6.9637693670;50.9069301408;BUS;132\n" +
               "7022;Cäsarstr.;CAE;70;6.9639344530;50.9057548327;BUS;132\n" +
               "7121;Leichweg;LCH;71;6.9490776360;50.9042895249;BUS;130\n" +
               "7122;Leichweg;LCH;71;6.9490993741;50.9040991479;BUS;130\n" +
               "7221;Liblarer Str.;LIB;72;6.9522320907;50.9003602936;BUS;131 133\n" +
               "7223;Liblarer Str.;LIB;72;6.9512424068;50.9003296127;BUS;131 133\n" +
               "7321;Heeresamt;HER;73;6.9514443138;50.8974893086;BUS;131\n" +
               "7322;Heeresamt;HER;73;6.9513546059;50.8976732766;BUS;131\n" +
               "7421;Brühler Str./Gürtel;BSG;74;6.9579638050;50.9038443797;BUS;130\n" +
               "7422;Brühler Str./Gürtel;BSG;74;6.9582014765;50.9036332261;BUS;130\n" +
               "7423;Brühler Str./Gürtel;BSG;74;6.9576260354;50.9046818190;BUS;133\n" +
               "7424;Brühler Str./Gürtel;BSG;74;6.9576782597;50.9048502877;BUS;133\n" +
               "7521;Wasserwerk;WSW;75;6.9664685175;50.8886668792;BUS;132\n" +
               "7522;Wasserwerk;WSW;75;6.9664874376;50.8885230378;BUS;132\n" +
               "7611;Bayenthalgürtel;OBU;76;6.9780972632;50.9065907764;STRAB;16 17\n" +
               "7612;Bayenthalgürtel;OBU;76;6.9776831036;50.9069767191;STRAB;16 17\n" +
               "7621;Bayenthalgürtel;OBU;76;6.9759201111;50.9062061481;BUS;130\n" +
               "7622;Bayenthalgürtel;OBU;76;6.9764055526;50.9060560955;BUS;130\n" +
               "7821;Goltsteinstr./Gürtel;GTS;78;6.9717678680;50.9042922225;BUS;106\n" +
               "7822;Goltsteinstr./Gürtel;GTS;78;6.9713679771;50.9048596161;BUS;106\n" +
               "7823;Goltsteinstr./Gürtel;GTS;78;6.9708392728;50.9046339442;BUS;130\n" +
               "7824;Goltsteinstr./Gürtel;GTS;78;6.9720274281;50.9046560352;BUS;130\n" +
               "7921;Marienburger Str.;MBU;79;6.9739027544;50.9009466476;BUS;106\n" +
               "7922;Marienburger Str.;MBU;79;6.9735913749;50.9013996553;BUS;106\n" +
               "8021;Marienburg Südpark;MBG;80;6.9755835088;50.8983650948;BUS;106\n" +
               "8022;Marienburg Südpark;MBG;80;6.9756272604;50.8983597380;BUS;106\n" +
               "8121;Bonner Str./Gürtel;BOG;81;6.9645313858;50.9043443139;BUS;132\n" +
               "8122;Bonner Str./Gürtel;BOG;81;6.9643443900;50.9043138911;BUS;132\n" +
               "8123;Bonner Str./Gürtel;BOG;81;6.9648987839;50.9038649656;BUS;130\n" +
               "8124;Bonner Str./Gürtel;BOG;81;6.9655841954;50.9036893948;BUS;130\n" +
               "8221;Gaedestr.;GAE;82;6.9653526871;50.9013721517;BUS;132\n" +
               "8222;Gaedestr.;GAE;82;6.9653576301;50.9005182757;BUS;132\n" +
               "8321;Leyboldstr.;LBD;83;6.9661012968;50.8986785137;BUS;132\n" +
               "8322;Leyboldstr.;LBD;83;6.9662063991;50.8971543652;BUS;132\n" +
               "8421;Arnoldshöhe;ANH;84;6.9668358640;50.8956424110;BUS;132\n" +
               "8422;Arnoldshöhe;ANH;84;6.9668100663;50.8952552274;BUS;132\n" +
               "8521;Am Kölnberg;AKB;85;6.9277999564;50.8626110840;BUS;132 192\n" +
               "8522;Am Kölnberg;AKB;85;6.9276741207;50.8626702773;BUS;132 192\n" +
               "8621;Meschenich Kirche;MSK;86;6.9276868113;50.8611663620;BUS;135 192\n" +
               "8622;Meschenich Kirche;MSK;86;6.9268868890;50.8603239017;BUS;132\n" +
               "8624;Meschenich Kirche;MSK;86;6.9273624198;50.8603035701;BUS;135 192\n" +
               "8722;Engeldorfer Str.;EDS;87;6.9284948586;50.8589568787;BUS;132\n" +
               "8821;Frankenstr.;FRS;88;6.9279166995;50.8531832223;BUS;132\n" +
               "8822;Frankenstr.;FRS;88;6.9279166995;50.8531832223;BUS;132\n" +
               "8921;Engeldorfer Hof;EDH;89;6.9211680326;50.8538002121;BUS;132\n" +
               "9021;Kettelerstr.;KET;90;6.9320685556;50.8611049746;BUS;135\n" +
               "9022;Kettelerstr.;KET;90;6.9321046972;50.8610621747;BUS;135\n" +
               "9121;Josef-Lammerting-Allee;JLA;91;6.8872862683;50.9451796377;BUS;140 141\n" +
               "9122;Josef-Lammerting-Allee;JLA;91;6.8875749872;50.9458860223;BUS;140 141\n" +
               "9221;Höningen Rondorfer Weg;HOE;92;6.9370340980;50.8803582167;BUS;131\n" +
               "9222;Höningen Rondorfer Weg;HOE;92;6.9367165762;50.8800443826;BUS;131\n" +
               "9321;Höningen Siedlung;HOS;93;6.9393329617;50.8834274315;BUS;131\n" +
               "9322;Höningen Siedlung;HOS;93;6.9396485732;50.8840432382;BUS;131\n" +
               "9421;Bonner Landstr.;BLD;94;6.9699174046;50.8833055419;BUS;131\n" +
               "9422;Bonner Landstr.;BLD;94;6.9693359852;50.8828821589;BUS;131\n" +
               "9521;Hochkirchen;HOC;95;6.9627405492;50.8788521774;BUS;131 132\n" +
               "9522;Hochkirchen;HOC;95;6.9632027190;50.8791388750;BUS;131 132\n" +
               "9621;Lerchenweg;LER;96;6.9613138266;50.8779305725;BUS;131\n" +
               "9622;Lerchenweg;LER;96;6.9602746524;50.8772763667;BUS;131\n" +
               "9721;Rondorf;RON;97;6.9549993875;50.8739227693;BUS;131\n" +
               "9722;Rondorf;RON;97;6.9546877340;50.8737977783;BUS;131\n" +
               "9821;Bödinger Str.;BOE;98;6.9506359702;50.8744860354;BUS;131 132\n" +
               "9822;Bödinger Str.;BOE;98;6.9510360115;50.8742777479;BUS;131 132\n" +
               "9921;Westerwaldstr.;WWS;99;6.9467516560;50.8720638718;BUS;132\n" +
               "9922;Westerwaldstr.;WWS;99;6.9470682419;50.8723055316;BUS;132\n" +
               "10021;Friedhof Rodenkirchen;FHR;100;7.0028692984;50.8796668640;BUS;130\n" +
               "10022;Friedhof Rodenkirchen;FHR;100;7.0028987122;50.8791020174;BUS;130\n" +
               "10121;Am Steinneuerhof;ASH;101;6.9389232848;50.8765613824;BUS;131\n" +
               "10122;Am Steinneuerhof;ASH;101;6.9381963463;50.8766893835;BUS;131\n" +
               "10221;Friedhof Steinneuerhof;FSH;102;6.9374509737;50.8734618887;BUS;131\n" +
               "10321;Kirschbaumweg;KIR;103;6.9934590974;50.8727822829;BUS;135\n" +
               "10322;Kirschbaumweg;KIR;103;6.9934921982;50.8727727790;BUS;135\n" +
               "10421;Mannesmannstr.;MMS;104;6.9912199153;50.8687171309;BUS;135\n" +
               "10422;Mannesmannstr.;MMS;104;6.9914390555;50.8688532027;BUS;135\n" +
               "10521;Hahnwald;HAH;105;6.9781305245;50.8699721475;BUS;135\n" +
               "10522;Hahnwald;HAH;105;6.9786305956;50.8697805192;BUS;135\n" +
               "10611;Rodenkirchen Bf;BRK;106;6.9900822811;50.8909721490;STRAB;16 17\n" +
               "10612;Rodenkirchen Bf;BRK;106;6.9902028198;50.8906527868;STRAB;16 17\n" +
               "10621;Rodenkirchen Bf;BRK;106;6.9906547911;50.8912391407;BUS;130\n" +
               "10622;Rodenkirchen Bf;BRK;106;6.9908299232;50.8915377821;BUS;134\n" +
               "10623;Rodenkirchen Bf;BRK;106;6.9903506695;50.8911193229;BUS;131 135\n" +
               "10624;Rodenkirchen Bf;BRK;106;6.9903506695;50.8911193229;BUS;131 135\n" +
               "10625;Rodenkirchen Bf;BRK;106;6.9903506695;50.8911193229;BUS;130\n" +
               "10626;Rodenkirchen Bf;BRK;106;6.9903506695;50.8911193229;BUS;130 134\n" +
               "10711;Siegstr.;SGS;107;6.9948832600;50.8830097000;STRAB;16 17\n" +
               "10712;Siegstr.;SGS;107;6.9944432840;50.8836210023;STRAB;16 17\n" +
               "10811;Michaelshoven;MIC;108;6.9990329898;50.8761245872;STRAB;16 17\n" +
               "10812;Michaelshoven;MIC;108;6.9991942468;50.8757449359;STRAB;16 17\n" +
               "10921;Maternusplatz;MAT;109;6.9934724893;50.8926438867;BUS;131 134\n" +
               "10922;Maternusplatz;MAT;109;6.9935932461;50.8926399371;BUS;131 134\n" +
               "11021;Frankstr.;FRA;110;6.9897913082;50.8944502532;BUS;130 134\n" +
               "11022;Frankstr.;FRA;110;6.9897057522;50.8947924321;BUS;130\n" +
               "11121;Rodenkirchen Rathaus;ROD;111;6.9964034544;50.8919536970;BUS;131 135\n" +
               "11122;Rodenkirchen Rathaus;ROD;111;6.9968517206;50.8914487466;BUS;131 135\n" +
               "11221;Grimmelshausenstr.;GRI;112;7.0024909713;50.8904260438;BUS;135\n" +
               "11222;Grimmelshausenstr.;GRI;112;7.0019718611;50.8902888157;BUS;135\n" +
               "11421;Uferstr.;UFS;114;7.0097721830;50.8916971556;BUS;135\n" +
               "11422;Uferstr.;UFS;114;7.0097721830;50.8916971556;BUS;135\n" +
               "11621;Siegfriedstr.;SFS;116;7.0004340950;50.8885774909;BUS;131\n" +
               "11622;Siegfriedstr.;SFS;116;7.0003109656;50.8884943470;BUS;131\n" +
               "11623;Siegfriedstr.;SFS;116;6.9988193253;50.8882805367;BUS;135\n" +
               "11624;Siegfriedstr.;SFS;116;6.9992082228;50.8884527808;BUS;135\n" +
               "11721;Grüngürtelstr.;GGS;117;7.0049555875;50.8849932396;BUS;131\n" +
               "11722;Grüngürtelstr.;GGS;117;7.0058980506;50.8845446398;BUS;131\n" +
               "11821;Richard-Wagner-Str.;RWS;118;7.0107443845;50.8827735579;BUS;131\n" +
               "11822;Richard-Wagner-Str.;RWS;118;7.0119801738;50.8820780836;BUS;131\n" +
               "11921;Adolf-Menzel-Str.;ADM;119;7.0155509635;50.8805441765;BUS;131\n" +
               "11922;Adolf-Menzel-Str.;ADM;119;7.0162652047;50.8802427977;BUS;131\n" +
               "12021;Konrad-Adenauer-Str.;KOS;120;6.9861962886;50.8905016922;BUS;131\n" +
               "12022;Konrad-Adenauer-Str.;KOS;120;6.9859512807;50.8903930458;BUS;131\n" +
               "12121;Schwabenstr.;SCW;121;6.9898062959;50.8866521709;BUS;135\n" +
               "12122;Schwabenstr.;SCW;121;6.9897541937;50.8871027621;BUS;135\n" +
               "12221;Schillingsrotter Str.;SIL;122;6.9896360406;50.8843585163;BUS;135\n" +
               "12222;Schillingsrotter Str.;SIL;122;6.9899193831;50.8846891530;BUS;135\n" +
               "12321;Am Neuen Forst;ANF;123;6.9948704662;50.8753574604;BUS;135\n" +
               "12322;Am Neuen Forst;ANF;123;6.9952366270;50.8756227738;BUS;135\n" +
               "12411;Sürth Bf;SUT;124;7.0036027124;50.8642972185;STRAB;16 17\n" +
               "12412;Sürth Bf;SUT;124;7.0034083907;50.8641221114;STRAB;16 17\n" +
               "12421;Sürth Bf;SUT;124;7.0042804864;50.8646027317;BUS;130 131\n" +
               "12422;Sürth Bf;SUT;124;7.0042804864;50.8646027317;BUS;130 131\n" +
               "12521;Wesselinger Str.;WLI;125;7.0045601805;50.8603891453;BUS;131";
       String[] tmp = tmpS.split("\n");
       return tmp;
    }


    public ArrayList<Haltestellen_Koordinaten> formatCSV() throws IOException {
        String[] haltestellen = get(); //Array mit allen haltestellen und linien.
        boolean ready;
        for(int i = 0; i < haltestellen.length; i++) {
            ready = false;
            String[] tmp = haltestellen[i].split(";");
            System.out.println(tmp[1] + tmp[4] + tmp[5]);
            Haltestellen_Koordinaten tmpH = new Haltestellen_Koordinaten(tmp[1], Double.valueOf(tmp[4]), Double.valueOf(tmp[5]));

            if (list.size() == 0) {
                list.add(tmpH);
            } else {
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k).getName().equals(tmpH.getName())) {
                        ready = true;
                    }
                }
                if(ready == false)
                {
                    list.add(tmpH);
                    System.out.println(tmpH.getName());
                }
            }
        }
        return list;
    }
}
