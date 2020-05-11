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
        /*FileReader fileReader = new FileReader("CSV.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;

        while ((line = bufferedReader.readLine()) != null)
        {
            lines.add(line);
        }

        bufferedReader.close();

        return lines.toArray(new String[lines.size()]);**/
       String tmpS = "Heumarkt;6.9604570988;50.9357563921\n" +
               "Neumarkt;6.9481136124;50.935762763\n" +
               "Poststr.;6.9500805214;50.9316916582\n" +
               "Mauritiuskirche;6.9450683908;50.9346873217\n" +
               "Rathaus;6.9595586023;50.9379333709\n" +
               "Appellhofplatz;6.950543766;50.9399234342\n" +
               "Dom/Hbf;6.9576248565;50.9418157999\n" +
               "Breslauer Platz/Hbf;6.9586599639;50.9444659285\n" +
               "Kuthstr./Vingst;7.0228043809;50.9331355959\n" +
               "Severinstr.;6.9579167704;50.9293389915\n" +
               "Waidmarkt;6.9555167174;50.9325043414\n" +
               "Rosenstr.;6.9612804867;50.926963893\n" +
               "Silbermöwenweg;6.8764385125;50.9664105452\n" +
               "Severinskirche;6.9615777821;50.9235360691\n" +
               "Ubierring;6.9651667181;50.9223180656\n" +
               "Chlodwigplatz;6.9602598735;50.9212222388\n" +
               "Ulrepforte;6.951437134;50.9243235691\n" +
               "Bonner Wall;6.9610329436;50.9164120165\n" +
               "Eifelplatz;6.943890293;50.9235685025\n" +
               "Eifelstr.;6.9454459025;50.9268426563\n" +
               "Barbarossaplatz;6.9434074467;50.9291439767\n" +
               "Zülpicher Platz;6.9404995694;50.931752713\n" +
               "Dasselstr./Bf Süd;6.9360885407;50.9284169787\n" +
               "Eifelwall;6.937176778;50.924873049\n" +
               "Rudolfplatz;6.9404793641;50.9358564043\n" +
               "Moltkestr.;6.9322876271;50.9355697577\n" +
               "Roonstr.;6.9340831982;50.9332666688\n" +
               "Friesenplatz;6.9398331173;50.9405264475\n" +
               "Hans-Böckler-Platz/Bf West;6.9336574523;50.9432005148\n" +
               "Christophstr./Mediapark;6.9429220331;50.9450646778\n" +
               "Gewerbegebiet Feldkassel;6.9164252998;51.0395498137\n" +
               "Reichenspergerplatz;6.9653026372;50.9544052196\n" +
               "Ebertplatz;6.9595370283;50.9510131543\n" +
               "Hansaring;6.9515505236;50.9487130848\n" +
               "Worringer Str.;6.9681693174;50.9553110776\n" +
               "Krefelder Wall;6.9504987617;50.9541346799\n" +
               "Deutzer Freiheit;6.9714199447;50.9380485371\n" +
               "Suevenstr.;6.9764936231;50.9328665266\n" +
               "Bf Deutz/Messe;6.9784139365;50.939631528\n" +
               "Koelnmesse;6.9822732717;50.9435849398\n" +
               "Deutz Technische Hochschule;6.9859264567;50.9365857842\n" +
               "Severinsbrücke;6.9723621637;50.9305708594\n" +
               "Drehbrücke;6.9746938581;50.9286423345\n" +
               "Poller Kirchweg;6.979670851;50.9239972353\n" +
               "Betzdorfer Str.;6.9916487917;50.9357830208\n" +
               "Bf Deutz/LANXESS arena;6.97857845;50.9392156282\n" +
               "Rotdornstr.;6.997965831;50.8856528409\n" +
               "Im Rheinpark;6.9750671091;50.9457966518\n" +
               "Pohligstr.;6.9415800881;50.9166833148\n" +
               "Herthastr.;6.9408740165;50.9132147158\n" +
               "Gottesweg;6.9415393127;50.9102247633\n" +
               "Kappelsweg;6.8604499745;50.9774610487\n" +
               "Zollstockgürtel;6.942062005;50.9057734927\n" +
               "Zollstock Südfriedhof;6.9440833113;50.9009722356\n" +
               "Zollstocksweg;6.9458054924;50.9088278205\n" +
               "Roisdorfer Str.;6.9456246177;50.9053049938\n" +
               "Kendenicher Str.;6.937238763;50.9018305262\n" +
               "Oberer Komarweg;6.9314030285;50.8985546518\n" +
               "Brüggener Str.;6.9392863685;50.9052207713\n" +
               "Bernkasteler Str.;6.9367102159;50.9066977316\n" +
               "Rheinsteinstr.;6.9596916524;50.9070721686\n" +
               "Schönhauser Str.;6.9717962172;50.9145492339\n" +
               "Marktstr.;6.9625082375;50.9118349353\n" +
               "Koblenzer Str.;6.9674888485;50.9124277673\n" +
               "Tacitusstr.;6.9697665959;50.9092999774\n" +
               "Mannsfeld;6.9629166291;50.9097443503\n" +
               "Cäsarstr.;6.963769367;50.9069301408\n" +
               "Leichweg;6.949077636;50.9042895249\n" +
               "Liblarer Str.;6.9522320907;50.9003602936\n" +
               "Heeresamt;6.9514443138;50.8974893086\n" +
               "Brühler Str./Gürtel;6.957963805;50.9038443797\n" +
               "Wasserwerk;6.9664685175;50.8886668792\n" +
               "Bayenthalgürtel;6.9780972632;50.9065907764\n" +
               "Goltsteinstr./Gürtel;6.971767868;50.9042922225\n" +
               "Marienburger Str.;6.9739027544;50.9009466476\n" +
               "Marienburg Südpark;6.9755835088;50.8983650948\n" +
               "Bonner Str./Gürtel;6.9645313858;50.9043443139\n" +
               "Gaedestr.;6.9653526871;50.9013721517\n" +
               "Leyboldstr.;6.9661012968;50.8986785137\n" +
               "Arnoldshöhe;6.966835864;50.895642411\n" +
               "Am Kölnberg;6.9277999564;50.862611084\n" +
               "Meschenich Kirche;6.9276868113;50.861166362\n" +
               "Engeldorfer Str.;6.9284948586;50.8589568787\n" +
               "Frankenstr.;6.9279166995;50.8531832223\n" +
               "Engeldorfer Hof;6.9211680326;50.8538002121\n" +
               "Kettelerstr.;6.9320685556;50.8611049746\n" +
               "Josef-Lammerting-Allee;6.8872862683;50.9451796377\n" +
               "Höningen Rondorfer Weg;6.937034098;50.8803582167\n" +
               "Höningen Siedlung;6.9393329617;50.8834274315\n" +
               "Bonner Landstr.;6.9699174046;50.8833055419\n" +
               "Hochkirchen;6.9627405492;50.8788521774\n" +
               "Lerchenweg;6.9613138266;50.8779305725\n" +
               "Rondorf;6.9549993875;50.8739227693\n" +
               "Bödinger Str.;6.9506359702;50.8744860354\n" +
               "Westerwaldstr.;6.946751656;50.8720638718\n" +
               "Friedhof Rodenkirchen;7.0028692984;50.879666864\n" +
               "Am Steinneuerhof;6.9389232848;50.8765613824\n" +
               "Friedhof Steinneuerhof;6.9374509737;50.8734618887\n" +
               "Kirschbaumweg;6.9934590974;50.8727822829\n" +
               "Mannesmannstr.;6.9912199153;50.8687171309\n" +
               "Hahnwald;6.9781305245;50.8699721475\n" +
               "Rodenkirchen Bf;6.9900822811;50.890972149\n" +
               "Siegstr.;6.99488326;50.8830097\n" +
               "Michaelshoven;6.9990329898;50.8761245872\n" +
               "Maternusplatz;6.9934724893;50.8926438867\n" +
               "Frankstr.;6.9897913082;50.8944502532\n" +
               "Rodenkirchen Rathaus;6.9964034544;50.891953697\n" +
               "Grimmelshausenstr.;7.0024909713;50.8904260438\n" +
               "Uferstr.;7.009772183;50.8916971556\n" +
               "Siegfriedstr.;7.000434095;50.8885774909\n" +
               "Grüngürtelstr.;7.0049555875;50.8849932396\n" +
               "Richard-Wagner-Str.;7.0107443845;50.8827735579\n" +
               "Adolf-Menzel-Str.;7.0155509635;50.8805441765\n" +
               "Konrad-Adenauer-Str.;6.9861962886;50.8905016922\n" +
               "Schwabenstr.;6.9898062959;50.8866521709\n" +
               "Schillingsrotter Str.;6.9896360406;50.8843585163\n" +
               "Am Neuen Forst;6.9948704662;50.8753574604\n" +
               "Sürth Bf;7.0036027124;50.8642972185\n" +
               "Wesselinger Str.;7.0045601805;50.8603891453\n" +
               "Marktplatz Sürth;7.0071682917;50.8620066515\n" +
               "Kölnstr.;7.0114384954;50.8644346296\n" +
               "Ernst-Volland-Str.;7.0172074576;50.867504182\n" +
               "Hammerschmidtstr.;7.021237078;50.8709885221\n" +
               "Ritterstr.;7.0238824533;50.8724613873\n" +
               "Weißer Hauptstr.;7.0296706822;50.8756860478\n" +
               "Weiß Friedhof;7.026742977;50.8773582524\n" +
               "Zum Hedelsberg;7.0207915694;50.8790749205\n" +
               "Godorf Bf;6.9785506227;50.8473892093\n" +
               "Pierstr.;6.9757068093;50.8490652811\n" +
               "Otto-Hahn-Str.;6.9745832588;50.8585666829\n" +
               "Bunsenstr.;6.9752143974;50.853113239\n" +
               "Friedhof Godorf;6.9709498722;50.8504702277\n" +
               "Immendorf Siedlung;6.9659021785;50.8536560958\n" +
               "Immendorf;6.9591596324;50.8587516411\n" +
               "Zaunhof;6.9552932523;50.8601093827\n" +
               "Mohnweg;6.8555116438;50.937951798\n" +
               "Universitätsstr.;6.9242751929;50.936653862\n" +
               "Melaten;6.917048536;50.936734511\n" +
               "Hildegardis-Krankenhaus;6.9234198989;50.9304430817\n" +
               "Geibelstr.;6.9182488422;50.9277418653\n" +
               "Leiblplatz;6.9156168592;50.9256018504\n" +
               "Karl-Schwering-Platz;6.9165582331;50.9307471183\n" +
               "Theresienstr.;6.912849942;50.9292693791\n" +
               "Weißhausstr.;6.9337951463;50.921716127\n" +
               "Arnulfstr.;6.9305212496;50.918530254\n" +
               "Sülzburgstr.;6.9272712127;50.9154256532\n" +
               "Universität;6.9312003766;50.9259899857\n" +
               "Weyertal;6.9266969847;50.9239487087\n" +
               "Lindenburg;6.9219898154;50.9223667195\n" +
               "Konradstr.;6.9274913996;50.9200052644\n" +
               "Gerolsteiner Str.;6.9238888606;50.9172243833\n" +
               "Rhöndorfer Str.;6.9327678719;50.9137668236\n" +
               "Sülzgürtel;6.923621571;50.9119404249\n" +
               "Berrenrather Str./Gürtel;6.9200889136;50.9148727431\n" +
               "Euskirchener Str.;6.9175793024;50.916605177\n" +
               "Zülpicher Str./Gürtel;6.9154838473;50.9200783382\n" +
               "Mommsenstr.;6.9104685267;50.9192302985\n" +
               "Sülz Hermeskeiler Platz;6.9075333704;50.9173111307\n" +
               "Klettenbergpark;6.9198139012;50.908304222\n" +
               "Siebengebirgsallee;6.929075753;50.9098092876\n" +
               "Wüllnerstr.;6.9080534726;50.9310586409\n" +
               "Dürener Str./Gürtel;6.9085685275;50.9287366681\n" +
               "Kitschburger Str.;6.9010693036;50.9262777791\n" +
               "Brahmsstr.;6.8981767647;50.9259532153\n" +
               "Gleueler Str./Gürtel;6.9117296327;50.9244180327\n" +
               "Hohenlind;6.8971948678;50.9247382681\n" +
               "Krieler Str.;6.907029111;50.921363353\n" +
               "Koppensteinstr.;6.9024052221;50.9184499803\n" +
               "Deckstein;6.9000757331;50.9168457682\n" +
               "Aachener Str./Gürtel;6.9076890582;50.9370338168\n" +
               "Maarweg;6.8998206771;50.9371956109\n" +
               "Clarenbachstift;6.8948011427;50.9372949644\n" +
               "Eupener Str.;6.8899651128;50.9374340241\n" +
               "Melatengürtel;6.9105605258;50.9393562796\n" +
               "Stolberger Str./Eupener Str.;6.8889749145;50.9422277388\n" +
               "Geilenkircher Str.;6.8981690682;50.9418864788\n" +
               "Müngersdorf S-Bahn/Technologiepark;6.8881960484;50.9484632905\n" +
               "Alter Militärring;6.8818674887;50.9376912853\n" +
               "Rheinenergie-Stadion;6.8750056274;50.9375916658\n" +
               "Wendelinstr.;6.8799245778;50.9406063595\n" +
               "Herrigergasse;6.8764529677;50.9416146964\n" +
               "Kämpchensweg;6.8730110529;50.9451999427\n" +
               "Am Lindenweg;6.862858263;50.9508249121\n" +
               "Flachsweg;6.8612180546;50.9461230096\n" +
               "Leinsamenweg;6.8535554832;50.9453055809\n" +
               "Roggenweg;6.8489971953;50.9477332208\n" +
               "Vitalisstr. Süd;6.8823941411;50.9431232343\n" +
               "Widdersdorfer Str.;6.8853891772;50.9465680249\n" +
               "Technologiepark Köln;6.8912771736;50.9467174314\n" +
               "Schwindstr.;6.8614802236;50.9408796174\n" +
               "Böcklinstr.;6.8581855476;50.9415196569\n" +
               "Junkersdorf;6.8692130063;50.9376549772\n" +
               "Eygelshovener Str.;7.0110313855;50.8778876293\n" +
               "Birkenallee;6.8604203686;50.9338365132\n" +
               "Kölner Weg;6.8574809889;50.9317274936\n" +
               "Sterrenhofweg;6.8544491368;50.9280402467\n" +
               "Beethovenstr.;6.8525182611;50.9296432474\n" +
               "Südallee;6.8640324016;50.9305010872\n" +
               "Wiener Weg;6.8653365943;50.927123277\n" +
               "Egelspfad;6.8542968619;50.9420857297\n" +
               "Bf Lövenich;6.8325599733;50.9436999606\n" +
               "Seithümerstr.;6.8322776841;50.9462638286\n" +
               "Dieselstr.;6.8418387948;50.94708881\n" +
               "Zaunstr.;6.8298971217;50.9470527945\n" +
               "An der Ronne;6.8286721958;50.950186069\n" +
               "Spitzangerweg;6.8269082309;50.9474638878\n" +
               "Saarstr.;6.821374911;50.9439693254\n" +
               "Severinusstr.;6.8250360343;50.9428193697\n" +
               "Braugasse;6.8299474449;50.9443280358\n" +
               "Selma-Lagerlöf-Str.;6.8285210259;50.9416907571\n" +
               "Frechener Weg;6.826625298;50.9388643937\n" +
               "Üsdorf;6.826748421;50.9352138935\n" +
               "Weiden Sportplatz;6.8409505676;50.9422466203\n" +
               "Stormstr.;6.8452632748;50.9419780626\n" +
               "Sürther Feldallee;7.0105297922;50.8751958705\n" +
               "Ostlandstr.;6.8345843831;50.9356517345\n" +
               "Rosenhügel;7.0599512293;50.8739525469\n" +
               "Diepenbeekallee;6.8458262904;50.9352157778\n" +
               "Im Buschfelde;6.8388652809;50.9676413938\n" +
               "Widdersdorf;6.8348263433;50.9665713914\n" +
               "Adrian-Meller-Str.;6.8302860479;50.963806388\n" +
               "Blaugasse;6.8303556704;50.9613587366\n" +
               "Stüttgenhof;6.8775272415;50.9200768232\n" +
               "Marsdorf;6.8591296094;50.9176401051\n" +
               "Piusstr.;6.9262808103;50.9457972596\n" +
               "Körnerstr.;6.9208488069;50.9480603452\n" +
               "Gutenbergstr.;6.9286616753;50.9502269672\n" +
               "Liebigstr.;6.925203178;50.9517416253\n" +
               "Weiden Römergrab;6.8290759482;50.9383261109\n" +
               "Schaffrathsgasse;6.8701294472;50.971441805\n" +
               "Walter-Pauli-Ring;6.9949488176;50.9370860096\n" +
               "Willi-Lauf-Allee;6.8616810229;50.9260016506\n" +
               "Subbelrather Str./Gürtel;6.9212755966;50.9546881859\n" +
               "Nußbaumerstr.;6.9233647096;50.9567783751\n" +
               "Lenauplatz;6.9183062025;50.9586436293\n" +
               "Heinrich-Erpenbach-Str.;7.0063887191;50.8690642679\n" +
               "Iltisstr.;6.9126395352;50.96468836\n" +
               "Butzweilerstr.;6.9163963102;50.9688078786\n" +
               "Venloer Str./Gürtel;6.9165360069;50.949978101\n" +
               "Eichenstr.;6.8684046416;50.9263482213\n" +
               "Geisselstr.;6.9167230688;50.9435249675\n" +
               "Weinsbergstr./Gürtel;6.9127818808;50.9447959948\n" +
               "Leyendeckerstr.;6.9097433933;50.9544653749\n" +
               "Borsigstr.;6.9052066652;50.9588716993\n" +
               "Bf Deutz/Messeplatz;6.973079612;50.9421138499\n" +
               "Oskar-Jäger-Str.;6.906788181;50.9453368622\n" +
               "Karnevalsmuseum;6.8972766953;50.9460116175\n" +
               "Weiden Zentrum;6.8356191911;50.9381674573\n" +
               "Rochusplatz;6.9033702265;50.95658111\n" +
               "Alter Deutzer Postweg;7.0499341836;50.919204941\n" +
               "Akazienweg;6.8945909142;50.9603106035\n" +
               "Wilhelm-Mauser-Str.;6.8919841814;50.9564077374\n" +
               "Häuschensweg;6.9012780168;50.9611743391\n" +
               "Feltenstr.;6.9002831987;50.963039125\n" +
               "Emilstr.;6.8979082555;50.9664138547\n" +
               "Erlenweg;6.8954943507;50.9684749195\n" +
               "Mühlenweg;6.891027379;50.9707682344\n" +
               "Ossendorf;6.9038504663;50.9773564884\n" +
               "Rektor-Klein-Str.;6.9047600685;50.9734805757\n" +
               "Margaretastr.;6.9055365947;50.9681266568\n" +
               "Alter Flughafen Butzweilerhof;6.8986242362;50.9774795728\n" +
               "Hugo-Eckener-Str.;6.8923332092;50.9776277277\n" +
               "Blériotstr.;6.8910118301;50.974223821\n" +
               "Von-Hünefeld-Str.;6.8852767429;50.9773355573\n" +
               "Mathias-Brüggen-Str.;6.885241621;50.9830082979\n" +
               "Wolffsohnstr.;6.8847907768;50.9650232247\n" +
               "Westfriedhof;6.8787729614;50.9673319468\n" +
               "Lacher Broch;7.0410168502;50.9584518666\n" +
               "Kolkrabenweg;6.8787027544;50.964427735\n" +
               "Steinkauzweg;6.8746424672;50.9634468659\n" +
               "Bachstelzenweg;6.8721271594;50.9614466903\n" +
               "Goldammerweg;6.8741462773;50.9579691306\n" +
               "Vogelsanger Markt;6.881963875;50.9556691221\n" +
               "Falkenweg;6.8845698055;50.9555607766\n" +
               "Bocklemünd;6.8733516998;50.9692029764\n" +
               "WDR;6.8567268063;50.970018809\n" +
               "Grevenbroicher Str.;6.8660731832;50.9726630342\n" +
               "Dohmengasse;6.8578501773;50.9805802901\n" +
               "Kochwiesenstr.;7.0497332364;50.9632777131\n" +
               "Auweilerweg;6.8589531756;50.9868941274\n" +
               "Ollenhauerring;6.8711156877;50.975684639\n" +
               "Nüssenberger Str.;6.8646313854;50.9773530385\n" +
               "Börnestr.;6.8652539958;50.9798458185\n" +
               "Heinrich-Mann-Str.;6.8651880284;50.9836499869\n" +
               "Buschweg;6.8602210418;50.9845743871\n" +
               "Neusser Str./Gürtel;6.9513443152;50.972558269\n" +
               "Florastr.;6.9536992834;50.9647933644\n" +
               "Lohsestr.;6.9551338824;50.9585057929\n" +
               "Nordstr.;6.9532527645;50.9676416784\n" +
               "Leipziger Platz;6.955677661;50.9664610125\n" +
               "Niehler Str.;6.9595487245;50.9675330549\n" +
               "Kretzerstr.;6.9641316247;50.9669296197\n" +
               "Bergstr.;6.9463806896;50.9737802943\n" +
               "Sechzigstr.;6.9446910871;50.9582068565\n" +
               "Merheimer Platz;6.9496982117;50.9577355728\n" +
               "Zoo/Flora;6.9746136126;50.9580257435\n" +
               "Boltensternstr.;6.9810840453;50.9624309575\n" +
               "Slabystr.;6.9878473117;50.9661127197\n" +
               "Kinderkrankenhaus;6.9685710777;50.9635655857\n" +
               "Amsterdamer Str./Gürtel;6.969563341;50.9708508462\n" +
               "Bodinusstr.;6.9737609696;50.9612416734\n" +
               "Riehler Gürtel;6.9764859821;50.9643065928\n" +
               "Seniorenzentrum Riehl;6.9800721691;50.9666663102\n" +
               "Kleingartenanlage Ostheim;7.0345710311;50.921976252\n" +
               "Xantener Str.;6.9679166342;50.9661768562\n" +
               "Geldernstr./Parkgürtel;6.9408371539;50.9684206072\n" +
               "Escher Str.;6.9340416422;50.9647995665\n" +
               "Nievenheimer Str.;6.940281057;50.9628099405\n" +
               "Ludwigsburger Str.;6.9401967631;50.9655041509\n" +
               "Frankenthaler Str.;6.9366648688;50.9689338839\n" +
               "Ebernburgweg;6.9318818624;50.9690110615\n" +
               "Alzeyer Str.;6.9271665925;50.970352779\n" +
               "Am Bilderstöckchen;6.926383194;50.9732971861\n" +
               "Robert-Perthel-Str.;6.9184718869;50.9806505633\n" +
               "Gewerbegebiet Bilderstöckchen;6.9129192831;50.9837802121\n" +
               "Mollwitzstr.;6.9487860378;50.9783943545\n" +
               "Scheibenstr.;6.9462360828;50.9858860924\n" +
               "Nordfriedhof;6.9458367699;50.9759309314\n" +
               "Nibelungenplatz;6.9391824872;50.9748652912\n" +
               "Schmiedegasse;6.9354749743;50.977013878\n" +
               "Etzelstr.;6.9320162668;50.9784191952\n" +
               "Niehl;6.9553408349;50.9957591477\n" +
               "Niehl Sebastianstr.;6.9615707725;50.9851206807\n" +
               "Friedrich-Karl-Str.;6.9599418848;50.9747863453\n" +
               "Drosselweg;6.9609001969;50.977003216\n" +
               "Weidenpescher Str.;6.9634647737;50.9795487619\n" +
               "Graditzer Str.;6.9608223977;50.9821860106\n" +
               "Merkenicher Str.;6.961401814;50.9891880088\n" +
               "Halfengasse;6.9587938591;50.9924249725\n" +
               "Niehler Damm;6.9610216542;50.994203719\n" +
               "Niehl Betriebshof Nord;6.9734220811;50.9750416747\n" +
               "St.-Joseph-Kirche;7.0028855931;50.886379929\n" +
               "Meerfeldstr.;6.9211408171;50.9950795534\n" +
               "Longericher Str.;6.9146057965;50.9961079443\n" +
               "Longerich Friedhof;6.911814103;50.9960766773\n" +
               "Longerich S-Bahn;6.903341561;50.9992166776\n" +
               "Lindweilerweg;6.9015582282;50.9952749733\n" +
               "Dionysstr.;6.9072507364;50.9972999847\n" +
               "Dädalusring;6.9056740984;50.9909268982\n" +
               "Wilhelm-Sollmann-Str.;6.9410320718;50.9921401511\n" +
               "Altonaer Platz;6.9336706112;50.9938399029\n" +
               "Herforder Str.;6.9248878971;50.994695249\n" +
               "Bremerhavener Str.;6.9364596709;50.998418093\n" +
               "Esso;6.9295329609;51.0075330308\n" +
               "Geestemünder Str.;6.955361564;51.0022895577\n" +
               "Fordwerke Süd;6.9554442487;51.0060850795\n" +
               "Fordwerke Mitte;6.955447677;51.0120845499\n" +
               "Fordwerke Nord;6.9554805047;51.0181639435\n" +
               "Heinering;6.8721564291;50.9963594097\n" +
               "Pesch Schulstr.;6.8695630276;50.9989030592\n" +
               "Auweiler;6.8530195703;51.0026097127\n" +
               "Hermann-Löns-Str.;6.8537923728;51.0054918609\n" +
               "Chorbuschstr.;6.8587974924;51.0129521627\n" +
               "Esch;6.854376028;51.0139530641\n" +
               "Johannes-Prassel-Str.;6.8473649543;51.0145424809\n" +
               "Sinnersdorfer Mühle;6.8347388358;51.017793024\n" +
               "Pescher Weg;6.8821666175;50.9997468429\n" +
               "Otto-Müller-Str.;6.8786110079;51.0005971573\n" +
               "Gewerbegebiet Pesch;6.8738860478;51.0035638135\n" +
               "Donatusstr.;6.8717557447;51.0067399287\n" +
               "Heimersdorf;6.9067196661;51.0120826472\n" +
               "Chorweiler;6.8981233769;51.0209467311\n" +
               "Karl-Marx-Allee;6.9040530937;51.0238896322\n" +
               "Am Hetzepetsch;6.9128171319;51.0143410868\n" +
               "Herstattallee;6.9039305696;51.0167999325\n" +
               "Zypressenstr.;6.8993180451;51.0125752735\n" +
               "Stallagsweg;6.8958679663;51.0105002816\n" +
               "Pulheimer Str.;6.8988777356;51.0057638582\n" +
               "Marienberger Weg;6.8927387623;51.0000888176\n" +
               "Lindweilerfeld;6.8896939566;51.0030417123\n" +
               "Unnauer Weg;6.8895120818;51.0072618945\n" +
               "Seeberg;6.9180512734;51.0183946113\n" +
               "Merianstr.;6.9093512732;51.0265013784\n" +
               "Fühlinger Weg;6.8884610505;51.0201249116\n" +
               "Friedhof Chorweiler;6.8812721151;51.0179999182\n" +
               "Blockstr.;6.8758892542;51.021815874\n" +
               "Wezelostr.;6.8856410445;51.0218030354\n" +
               "Weiler;6.8824527474;51.023372157\n" +
               "Volkhovener Weg;6.8926760694;51.0140888885\n" +
               "Weichselring;6.8962970695;51.0262521684\n" +
               "Haus Fühlingen;6.9068180837;51.0308080667\n" +
               "Fühlingen;6.9034113674;51.035881388\n" +
               "Mennweg;6.8981480208;51.0439430137\n" +
               "Langel Fähre;6.9145739087;51.0527218287\n" +
               "Langel Nord;6.9167012761;51.0508949456\n" +
               "Langel Mohlenweg;6.9200829984;51.0486749447\n" +
               "Langel Kuhlenweg;6.9251809911;51.0460730701\n" +
               "Rheinkassel;6.9328962844;51.0394980492\n" +
               "Oranjehofstr.;6.9396810116;51.0253718529\n" +
               "Rheinlandstr.;6.9282409724;51.0267618447\n" +
               "Edsel-Ford-Str.;6.9231380762;51.0301346978\n" +
               "Robert-Bosch-Str.;6.921224308;51.0311905119\n" +
               "Merkenich Mitte;6.9531573289;51.0244086561\n" +
               "Merkenich;6.9479415963;51.0282749861\n" +
               "Schlettstadter Str.;6.9516663402;51.0303449535\n" +
               "Kasselberg;6.9393913334;51.036602797\n" +
               "Worringen S-Bahn;6.8522887088;51.0522931666\n" +
               "Walter-Dodde-Weg;6.8512724033;51.0488296957\n" +
               "Baptiststr.;6.8491677956;51.0468566825\n" +
               "Further Str.;6.8473943325;51.0433888536\n" +
               "Alte Römerstr.;6.8827798795;51.0567480226\n" +
               "Worringen Süd;6.8729627026;51.0608133907\n" +
               "St.-Tönnis-Str.;6.8680081032;51.0651918812\n" +
               "Hackhauser Weg;6.8563777197;51.0614221604\n" +
               "Wiedenfelder Weg;6.8530738918;51.0644688311\n" +
               "Bitterstr.;6.8575838378;51.0691028815\n" +
               "Dornstr.;6.8573713703;51.0683780497\n" +
               "An den Kaulen;6.8598582943;51.064821825\n" +
               "Rolshover Str.;6.9992360823;50.9292888876\n" +
               "Üdesheimer Weg;6.8577613958;51.0581796688\n" +
               "Mühlenweiher;6.8646046057;51.0651213652\n" +
               "Ettore-Bugatti-Str.;7.0547438876;50.908803048\n" +
               "Poll Salmstr.;6.9931789258;50.9160967579\n" +
               "Baumschulenweg;6.9998165861;50.9149444646\n" +
               "Schüttewerk;6.9831521018;50.9134143969\n" +
               "Alfred-Schütte-Allee;6.9844274341;50.9119246646\n" +
               "Poll Hauptstr.;6.9895582155;50.9112246729\n" +
               "Im Wasserfeld;6.9934559829;50.9112802361\n" +
               "Raiffeisenstr.;6.98606413;50.9199186058\n" +
               "Poller Holzweg;6.9967888935;50.918258272\n" +
               "Taubenholzweg;6.9992541631;50.9219199988\n" +
               "Zündorfer Weg;6.9985609922;50.9103835224\n" +
               "Siegburger Str.;6.9961554894;50.9139360637\n" +
               "Westhoven Kölner Str.;7.015157174;50.9064429355\n" +
               "Westhoven Berliner Str.;7.0263067704;50.9010760464\n" +
               "Ensen Gilgaustr.;7.0307765446;50.8995893393\n" +
               "Ensen Kloster;7.0475585337;50.8969598527\n" +
               "Albin-Köbis-Str.;7.0933162655;50.8631138621\n" +
               "Hansestr.;7.0656310603;50.9141600377\n" +
               "Neuenhofstr.;7.0552473361;50.9130680639\n" +
               "Humboldtstr.;7.0701893359;50.8917613387\n" +
               "Neue Eiler Str.;7.0748455934;50.8929338558\n" +
               "Eil Kirche;7.0780311325;50.892334139\n" +
               "Im Falkenhorst;7.080173084;50.8882468643\n" +
               "Eil Heumarer Str.;7.0778218543;50.8972888254\n" +
               "Maarhäuser Weg;7.0703193011;50.9102530814\n" +
               "Fuggerstr.;7.0769251638;50.9054280881\n" +
               "Rudolf-Diesel-Str.;7.0754192708;50.900613859\n" +
               "Theodor-Heuss-Str.;7.0645549562;50.8968632461\n" +
               "Stresemannstr.;7.0612998736;50.8970060905\n" +
               "Porz Steinstr.;7.0560626795;50.8918913949\n" +
               "Porz Markt;7.0591550616;50.8846297997\n" +
               "Bf Porz;7.0656944162;50.8827291805\n" +
               "Siemensstr.;7.0711041225;50.8856241358\n" +
               "Kopernikusschule;7.0707467962;50.8877446123\n" +
               "Feuerwache;7.072873888;50.8811060634\n" +
               "Antoniusstr.;7.0916725831;50.8816158306\n" +
               "Waldstr./Akazienweg;7.0975955188;50.8806107229\n" +
               "Grengel Mauspfad;7.1034352642;50.8803280454\n" +
               "Friedensstr.;7.0977271871;50.8772174801\n" +
               "Wiesenweg;7.0980671306;50.8729603678\n" +
               "Urbach Friedhof;7.087542402;50.8782785542\n" +
               "Friedrich-Hirsch-Str.;7.0842634821;50.8761213202\n" +
               "Elsdorf;7.0833467898;50.8722993168\n" +
               "Kaserne Nordtor;7.106738632;50.8725927936\n" +
               "Korber Weg;6.8902460449;51.0057049354\n" +
               "Dorotheenstr.;7.0733105672;50.8861968808\n" +
               "Zündorf;7.0487221669;50.8658972077\n" +
               "An St. Marien;7.0538915721;50.8640896383\n" +
               "Wahn S-Bahn;7.0796747065;50.8583924618\n" +
               "Wahn Kirche;7.0854251579;50.8572032911\n" +
               "Nachtigallenstr.;7.0827671649;50.863127167\n" +
               "Wahn Friedhof;7.0899142652;50.8525057836\n" +
               "Linder Kreuz;7.094308163;50.8467999703\n" +
               "Troisdorfer Str.;7.1009124852;50.8482741723\n" +
               "Linder Weg;7.105111158;50.8499791217\n" +
               "Linder Mauspfad;7.1098823325;50.8503892846\n" +
               "Deutzer Ring;6.9942488594;50.9354210277\n" +
               "Libur Kirche;7.0693699828;50.8382699991\n" +
               "Libur Margaretenstr.;7.0729699646;50.8392499458\n" +
               "Lucasstr.;7.1064860348;50.8656388145\n" +
               "Bieselweg;7.0997182911;50.8636668214\n" +
               "Kornblumenweg;7.0927021329;50.8584218716\n" +
               "Guntherstr.;7.1007996602;50.8587911276\n" +
               "DLR;7.1190443678;50.855166689\n" +
               "Urbach Waldstr.;7.0830152603;50.8813063801\n" +
               "Urbach Kaiserstr.;7.0809166081;50.8813860154\n" +
               "Kalk Post;6.9989591528;50.9375572005\n" +
               "Kalk Kapelle;7.0088299185;50.9389229541\n" +
               "Eythstr.;7.010944943;50.9402180388\n" +
               "Steinmetzstr.;7.0081941229;50.942641888\n" +
               "Remscheider Str.;7.007763783;50.944439941\n" +
               "Fuldaer Str.;7.0231586704;50.9416046629\n" +
               "Höhenberg Frankfurter Str.;7.0297304432;50.9417457092\n" +
               "Mülheimer Friedhof;7.0221731668;50.9470246542\n" +
               "Würzburger Str.;7.0195499653;50.939044961\n" +
               "Vingst;7.0222583241;50.932701843\n" +
               "Kürtenstr.;7.0173413028;50.928533041\n" +
               "Oranienstr.;7.0213113732;50.9360899115\n" +
               "Feldbergstr.;6.9941218484;50.9334080269\n" +
               "Weilburger Str.;6.9940180589;50.9316096551\n" +
               "Am Grauen Stein;6.9919676735;50.9238377148\n" +
               "Esserstr.;6.9965749175;50.9300913539\n" +
               "Gremberg;7.0106805918;50.9259113698\n" +
               "Gießener Str.;7.0009555934;50.9338802358\n" +
               "Sauerlandstr.;6.9996468943;50.926241836\n" +
               "Ostheim;7.042401237;50.9291592467\n" +
               "Autobahn (Stadtbahn);7.0542744049;50.9270401757\n" +
               "Buchheimer Weg;7.0373701249;50.9339040166\n" +
               "Saarbrücker Str.;7.0448529868;50.9251549774\n" +
               "Servatiusstr.;7.046540994;50.9298410666\n" +
               "Autobahn (Omnibus);7.0554419901;50.9288732057\n" +
               "Kalker Friedhof;7.0430997608;50.9427657974\n" +
               "Merheim;7.0476731155;50.9439323093\n" +
               "Broichstr.;7.0501632236;50.9502666928\n" +
               "Bevingsweg;7.0429246473;50.9496024511\n" +
               "Ostmerheimer Str.;7.0507541988;50.9415218698\n" +
               "Wiehler Str.;7.0643180519;50.9426480882\n" +
               "Gewerbegebiet Broichstr.;7.0597416568;50.9445085417\n" +
               "Flehbachstr.;7.0736069002;50.9478331269\n" +
               "Brück Mauspfad;7.0786019742;50.9488361163\n" +
               "Erker Mühle;7.09150572;50.9326446673\n" +
               "Kleinfeldchensweg;7.0862999369;50.9400891783\n" +
               "Bückebergstr.;7.0846365466;50.9418750139\n" +
               "Olpener Str.;7.0811085033;50.9457163531\n" +
               "Im Langen Bruch;7.0783775251;50.952123816\n" +
               "Steinweg;7.0665732185;50.9236995873\n" +
               "Porzer Str.;7.0747693018;50.9216999601\n" +
               "Röttgensweg;7.0902407356;50.9202941538\n" +
               "Rath-Heumar;7.0806712247;50.920450354\n" +
               "Königsforst;7.0964440718;50.9198439014\n" +
               "Schloss Röttgen;7.0815193788;50.9145461103\n" +
               "Eiler Str.;7.081569834;50.9170932247\n" +
               "Alte Forststr.;7.0911163402;50.9153685356\n" +
               "Baldurstr.;7.0950782009;50.9266491376\n" +
               "Europaring;7.0643998864;50.937946398\n" +
               "Straßburger Platz;7.0628862485;50.9350047401\n" +
               "Ludwig-Quidde-Platz;7.0556556674;50.9314307871\n" +
               "Rösrather Str.;7.0596679982;50.9291824887\n" +
               "Auguste-Kowalski-Str.;7.0238838172;51.005469388\n" +
               "Stegerwaldsiedlung;6.9933994166;50.9485947332\n" +
               "Grünstr.;7.0005301212;50.9558928783\n" +
               "Buchforst Waldecker Str.;7.004801252;50.9509631138\n" +
               "Mülheim Wiener Platz;7.005173058;50.9615209532\n" +
               "Montanusstr.;7.0125527971;50.9628666148\n" +
               "Bf Mülheim;7.0128560514;50.9569283058\n" +
               "Graf-Adolf-Str.;7.0096216445;50.9581874589\n" +
               "Kieler Str.;7.0044082757;50.9557724305\n" +
               "Buchheim Frankfurter Str.;7.0150157441;50.9533912249\n" +
               "Buchheim Herler Str.;7.0253468733;50.9580805156\n" +
               "Wichheimer Str.;7.030997982;50.9612718395\n" +
               "Gronauer Str.;7.0263812777;50.9656138254\n" +
               "Rheinbergstr.;7.0124600382;50.8505500253\n" +
               "Beuthener Str.;7.0183763848;50.9499230601\n" +
               "Holweide Vischeringstr.;7.0391597959;50.9669235532\n" +
               "Maria-Himmelfahrt-Str.;7.0449368681;50.9678684341\n" +
               "Neufelder Str.;7.0551684689;50.9694445499\n" +
               "Holweide S-Bahn;7.0438403034;50.9765490618\n" +
               "Grunerstr.;7.0502449597;50.976115569\n" +
               "Kühzällerweg;7.0480070671;50.9753152534\n" +
               "Gerhart-Hauptmann-Str.;7.0497518719;50.9733560984\n" +
               "Buschfeldstr.;7.0410880567;50.9717318965\n" +
               "Burgwiesenstr.;7.043538869;50.9642088926\n" +
               "Colonia-Allee;7.0472699571;50.9632549802\n" +
               "Schlagbaumsweg;7.0451912709;50.9593530235\n" +
               "Dellbrück Mauspfad;7.0645751185;50.9717892569\n" +
               "Dellbrück Hauptstr.;7.0745850556;50.9746073075\n" +
               "Thielenbruch;7.0859798955;50.978076569\n" +
               "Eggerbachstr.;7.0500729721;50.9545963448\n" +
               "Ostfriedhof;7.0729068199;50.9641371594\n" +
               "Siedlung Mielenforst;7.0677805219;50.9667782239\n" +
               "Thurner Kamp;7.0744671263;50.9686080765\n" +
               "Von-Quadt-Str.;7.0725318166;50.9768146367\n" +
               "Diepeschrather Str.;7.0679062747;50.9860747072\n" +
               "Anemonenweg;7.0687135279;50.9817443402\n" +
               "Dellbrück S-Bahn;7.0690879878;50.9811630715\n" +
               "Cottbuser Str.;7.0209200543;50.9791518933\n" +
               "Im Weidenbruch;7.0228591555;50.9807748157\n" +
               "Am Emberg;7.0303175824;50.9894796017\n" +
               "Leuchterstr.;7.0373969867;50.9960654585\n" +
               "Odenthaler Str.;7.0419082585;51.000959317\n" +
               "Honschaftsstr.;7.0315121278;50.9809492383\n" +
               "Am Springborn;7.0325055468;50.9776543466\n" +
               "Jasminweg;7.0398384951;50.9786302622\n" +
               "Sigwinstr.;7.0444332165;50.9817055882\n" +
               "Birkenweg;7.0414302336;50.9850585342\n" +
               "Höhscheider Weg;7.0421802437;50.988343524\n" +
               "Lippeweg;7.0432190939;50.9915024898\n" +
               "Klosterhof;7.0330842613;50.9998332632\n" +
               "Hildegundweg;7.0294356826;51.0003071497\n" +
               "Am Portzenacker;7.0299107905;51.0044135476\n" +
               "Leimbachweg;7.0279755516;51.0067040247\n" +
               "Paul-Reifenberg-Str.;6.9245396402;51.0131446186\n" +
               "Kalkweg;7.0555287962;50.9903021243\n" +
               "Wildpark;7.048016792;50.9927849508\n" +
               "Auf der Aue;7.0451305314;50.9970860653\n" +
               "Steinstr. S-Bahn;7.0576760942;50.8974988595\n" +
               "Mutzbach;7.0382437608;50.9993780861\n" +
               "Am Weißen Mönch;7.0258496056;50.9979841578\n" +
               "Bornheim Rathaus;7.0019513477;50.7572858987\n" +
               "Goldregenweg;7.0490818374;50.9793196327\n" +
               "Aeltgen-Dünwald-Str.;7.0248157439;51.0035443325\n" +
               "Keupstr.;7.0068662491;50.9662940337\n" +
               "Von-Sparr-Str.;7.0115406834;50.9705824978\n" +
               "Mülheim Berliner Str.;7.0148066203;50.9749592506\n" +
               "Dünnwalder Str.;7.0068695765;50.9687813804\n" +
               "Von-Lohe-Str.;7.006264975;50.9734599971\n" +
               "Am Faulbach;7.0029760258;50.9794018492\n" +
               "Neuer Mülheimer Friedhof;7.0043343949;50.984960756\n" +
               "Bruder-Klaus-Siedlung;7.0083018438;50.9817588482\n" +
               "Von-Galen-Str.;7.0127013619;50.9790549446\n" +
               "Moses-Hess-Str.;6.9997546731;50.9866910262\n" +
               "Stammheimer Ring;6.9974567842;50.98905385\n" +
               "Bonhoefferstr.;6.9922610254;50.9859943926\n" +
               "Am Alten Güterbahnhof;6.903900819;50.9515309902\n" +
               "Friedhof Stammheim;6.9910860892;50.9881357236\n" +
               "Egonstr.;6.9862580309;50.9907580441\n" +
               "Barbarastr.;6.9788034258;50.9693202511\n" +
               "Flittard Süd;6.9951610116;50.9985960245\n" +
               "Flittarder Feld;6.9942718771;51.0081238169\n" +
               "Am Feldrain;6.9814748987;50.9972088265\n" +
               "Edelhofstr.;6.9803177667;51.0008449237\n" +
               "Welserstr.;7.0585360257;50.9136799723\n" +
               "Nibelungenstr.;7.1047232479;50.8534466466\n" +
               "Ebertplatz/Riehler Str.;6.9592720878;50.9506582169\n" +
               "Wiedstr.;7.0087599055;50.9261018452\n" +
               "Im Hoppenkamp;7.1565834617;50.963203089\n" +
               "Sportplatzstr.;7.1022609983;50.8596971894\n" +
               "Frankfurter Str. S-Bahn;7.05261384;50.9160718482\n" +
               "Marienplatz;7.0802277163;50.8856732261\n" +
               "Vitalisstr. Nord;6.8942332237;50.9509999577\n" +
               "Gunther-Plüschow-Str.;6.884675342;50.9799414998\n" +
               "Eddaweg;7.0352356909;50.9765468815\n" +
               "Schlebusch;7.0445471812;51.018766643\n" +
               "Bensberg;7.1619624914;50.9634655062\n" +
               "Kölner Str.;7.1493149318;50.9626650579\n" +
               "Neuenweg;7.1424891354;50.9632455773\n" +
               "Lustheide;7.1052046194;50.9519668961\n" +
               "Refrath;7.1166484638;50.9539710947\n" +
               "Kippekausen;7.1295883834;50.956635244\n" +
               "Frankenforst;7.1367318975;50.9607570717\n" +
               "Roisdorf West;7.0079713732;50.7539096934\n" +
               "Bornheim;6.9893527187;50.7613071681\n" +
               "Dersdorf;6.9691337373;50.7647810509\n" +
               "Waldorf;6.95088107;50.7682356498\n" +
               "Merten;6.9332095365;50.7799050149\n" +
               "Walberberg;6.9207569574;50.7944321834\n" +
               "Hersel;7.0426776824;50.7702028138\n" +
               "Uedorf;7.0311350181;50.7822504385\n" +
               "Widdig;7.0219785729;50.7918866846\n" +
               "Alfter / Alanus Hochschule;7.0166913358;50.7439036465\n" +
               "Friedhof Lehmbacher Weg;7.0789886602;50.9325643708\n" +
               "Weiden West;6.8160528175;50.9401555634\n" +
               "Porz-Langel Süd;7.0069899774;50.8412200345\n" +
               "Sinnersdorf Kirche;6.8181596895;51.0234787016\n" +
               "Am Zehnthof;6.8211988183;51.0256088657\n" +
               "Kesselsgasse;6.8218479926;51.0224666622\n" +
               "Frechen-Benzelrath;6.7976472591;50.9043583636\n" +
               "Mühlengasse;6.8017641284;50.9081505054\n" +
               "Frechen Rathaus;6.806306205;50.9094523196\n" +
               "Frechen Kirche;6.8161540462;50.9100965172\n" +
               "Frechen Bf;6.8224345843;50.9114743774\n" +
               "Haus Vorst;6.8489163563;50.9157383438\n" +
               "Schokoladenmuseum;6.963124959;50.9326860939\n" +
               "Efferen;6.904262651;50.8946344753\n" +
               "Fischenich;6.8975775706;50.8649527525\n" +
               "Kiebitzweg;6.8977160741;50.8886059302\n" +
               "Hürth-Hermülheim;6.8947333675;50.8805419069\n" +
               "Brühl Nord;6.9018038124;50.8351066781\n" +
               "Brühl Mitte;6.8991758652;50.8293857957\n" +
               "Brühl Süd;6.8983537642;50.8225032668\n" +
               "Badorf;6.9002698306;50.8133433948\n" +
               "Brühl Vochem;6.901204103;50.8442775588\n" +
               "Schwadorf;6.9136555951;50.8013527797\n" +
               "Wesseling Süd;6.9993057109;50.8122351665\n" +
               "Wesseling;6.9792694909;50.8230333676\n" +
               "Wesseling Nord;6.9709233521;50.8320633333\n" +
               "Urfeld;7.0106503096;50.8037134282\n" +
               "Rheinauhafen;6.9656116352;50.924989958\n" +
               "Flughafen Personalparkplatz;7.1161130996;50.875465468\n" +
               "Johannesstr.;6.8777711518;50.9987181178\n" +
               "Mozartstr.;6.8743331765;51.0009610582\n" +
               "Kapellenweg;6.876916258;51.001162648\n" +
               "Friedhof Worringen;6.859885583;51.0628534206\n" +
               "Nippes S-Bahn;6.9414398468;50.9584236164\n" +
               "Ramrather Weg;6.8518288146;51.0665810564\n" +
               "Auf der Freiheit;6.9234527228;50.85691934\n" +
               "Franz-Liszt-Str.;6.9000057622;50.952358934\n" +
               "Innere Kanalstr.;6.9231174428;50.9408982225\n" +
               "Zündorf Marktstr.;7.0447700691;50.8685100206\n" +
               "Zündorf Kirche;7.0415599758;50.86634004\n" +
               "Zündorf Altersheim;7.0368399632;50.863079979\n" +
               "Zündorf Mitte;7.045250034;50.8663799745\n" +
               "Zündorf Olefsgasse;7.0410300671;50.8634300225\n" +
               "Zündorf Ranzeler Str.;7.0370500313;50.8606399926\n" +
               "Oberzündorf;7.0324222702;50.8600091931\n" +
               "Porz-Langel Nord;7.0250900201;50.8560900159\n" +
               "Porz-Langel Mühle;7.0182800188;50.8527800276\n" +
               "Porz-Langel Zur Eiche;7.0096299842;50.8485699917\n" +
               "Porz-Langel Kirche;7.0075300621;50.8446300115\n" +
               "Schadowstr.;6.9275121838;50.9534830923\n" +
               "Methweg;6.9357651638;50.9568246124\n" +
               "Schirmerstr.;6.9299938256;50.9544646311\n" +
               "Mechternstr.;6.9186454597;50.942645757\n" +
               "Pettenkoferstr.;6.9340360271;50.9560635533\n" +
               "Mülhauser Str.;6.9297721757;50.9749888778\n" +
               "Escher See;6.868894354;51.0071860972\n" +
               "Am Braunsacker;6.8621229871;51.0118146594\n" +
               "Reiherstr.;6.960236319;50.8757160734\n" +
               "Stolberger Str.;6.9048863742;50.9419262856\n" +
               "Buchforst S-Bahn;7.0044418349;50.9534404001\n" +
               "Rodenkirchen Bismarckstr.;7.0085071598;50.8907177375\n" +
               "Gewerbegebiet Pesch Nord;6.8746305075;51.0045282759\n" +
               "Sibille-Hartmann-Str.;6.9444919249;50.9137968025\n" +
               "Bonntor;6.9620359117;50.9145185321\n" +
               "Beuelsweg Nord;6.9589411168;50.9632996993\n" +
               "Indianapolis-Str.;6.8416592615;50.9681666935\n" +
               "Am Schildchen;7.0699562319;50.9455178601\n" +
               "August-Horch-Str.;7.0510648843;50.9092080865\n" +
               "Trifelsstr.;6.9340260482;50.9726580327\n" +
               "Edmund-Rumpler-Str.;7.0544776647;50.9119055733\n" +
               "Weiden Einkaufszentrum;6.8354692786;50.9380515341\n" +
               "Cheruskerstr.;7.0552470615;50.9005499964\n" +
               "Im Wichemshof;6.8502973773;51.0435566203\n" +
               "Dünnwald Waldbad;7.0545476753;50.9985751691\n" +
               "Im Wirtskamp;7.0518560527;50.9981407912\n" +
               "TÜV-Akademie;6.9941280323;50.9246049718\n" +
               "Mülheimer Ring;7.0207230888;50.9645274875\n" +
               "Imbacher Weg;7.0408149942;50.9941263578\n" +
               "Zur Abtei;6.8323098909;50.9596699195\n" +
               "Talweg;7.0530499984;50.903627797\n" +
               "Thermalbad;6.9808384867;50.9506468315\n" +
               "Zum Neuen Kreuz;6.8363998902;50.9612299579\n" +
               "Rosmarinweg;6.840769963;50.9629599785\n" +
               "Palmenhof;6.8424844439;50.9650983079\n" +
               "Arenzhof;6.9025814286;51.0391196905\n" +
               "Weilerweg;6.8867166451;51.0198471154\n" +
               "Arthur-Hantzsch-Str.;6.9896710075;50.9998930608\n" +
               "Stammheim S-Bahn;7.0005268174;50.989781067\n" +
               "Chempark S-Bahn;6.9957597331;51.0112482017\n" +
               "Osterather Str.;6.9393081734;50.9583310599\n" +
               "Trimbornstr.;6.9980557383;50.9350252672\n" +
               "Leopold-Gmelin-Str.;6.9863910481;51.0010663486\n" +
               "Nesselrodestr.;6.9688902189;50.977322882\n" +
               "Sprengelstr.;6.9689110745;50.9690657622\n" +
               "Niehler Kirchweg;6.9548917624;50.9741446214\n" +
               "Gauweg;7.0272666393;50.9625199508\n" +
               "Pasteurstr.;6.9771388956;50.9715332861\n" +
               "Göttinger Str.;6.8393171578;50.9356402334\n" +
               "St. Vinzenz-Hospital;6.9465524697;50.965459341\n" +
               "Wilhelmstr.;6.9504124721;50.9626768667\n" +
               "Cranachstr.;6.9540973244;50.9611540984\n" +
               "Beuelsweg;6.958695826;50.9622644594\n" +
               "Kuenstr.;6.963142311;50.9613494762\n" +
               "Schneider-Clauss-Str.;6.9590416917;50.9611416123\n" +
               "Bahnstr.;6.8456247841;50.9381000908\n" +
               "Klinikum Merheim;7.04922221;50.9391113411\n" +
               "Auf dem Streitacker;7.0562330452;50.906533835\n" +
               "Lessingstr.;6.9151367923;50.9558232833\n" +
               "Marienstr.;6.90810921;50.9586046417\n" +
               "Bf Ehrenfeld;6.9188360784;50.952433061\n" +
               "Takustr.;6.9114916851;50.9573041671\n" +
               "Zonser Str.;6.949213392;50.9587852625\n" +
               "Grüner Hof;6.9494631077;50.9751042898\n" +
               "Stommeler Str.;6.912408027;50.9989616951\n" +
               "Immendorf Schule;6.9627646583;50.8559715048\n" +
               "Am Nordpark;6.9330212951;51.003223067\n" +
               "Gisbertstr.;6.9921052095;50.9873135123\n" +
               "LVR-Klinik;7.0520099387;50.9361599441\n" +
               "Köln/Bonn Flughafen Terminal 2;7.1174614124;50.8810299394\n" +
               "Wiso-Fakultät;6.9288832155;50.9310388528\n" +
               "Lindenweg;6.962254569;50.8812030458\n" +
               "Franziska-Anneke-Str.;6.9144310986;50.9718160163\n" +
               "Prälat-van-Acken-Str.;6.8968313926;50.92511135\n" +
               "Am Serviesberg;6.8794071446;50.9419699629\n" +
               "Morsestr.;6.9226970718;51.0378332703\n" +
               "Marconistr.;6.9284821036;51.0339741938\n" +
               "Feldkasseler Weg;6.9237943513;51.0343068405\n" +
               "Florenzer Str.;6.8935192604;51.0228082353\n" +
               "Esch Friedhof;6.8590830678;51.0164185647\n" +
               "Marconistr. Ost;6.9292777941;51.0356777618\n" +
               "Güterverkehrszentrum;6.9208082958;50.8868566435\n" +
               "Longericher Str./Etzelstr.;6.9278641207;50.9777825785\n" +
               "Hugo-Junkers-Str.;6.9104382076;50.9873596971\n" +
               "Glashüttenstr.;7.060195559;50.8896149631\n" +
               "Klingerstr.;7.0625399613;50.8835888133\n" +
               "Krieger-Str.;7.1106129798;50.8799885917\n" +
               "Bachemer Str.;6.9270670498;50.9302615668\n" +
               "Hopfenstr.;7.0547375003;50.9421102121\n" +
               "IKEA Godorf;6.9742490804;50.8611360915\n" +
               "Bistritzer Str.;6.8427316201;50.9314463892\n" +
               "Wattstr.;7.000819567;50.9314966374\n" +
               "Am Vorgebirgstor;6.9464705306;50.9151938347\n" +
               "Justizzentrum;6.9379330566;50.9224030412\n" +
               "Bf Süd;6.9376730361;50.9267377803\n" +
               "Am Leinacker;7.0624474036;50.9646446133\n" +
               "Heinz-Kühn-Str.;7.0598954667;50.9661838565\n" +
               "Roteichenweg;7.0680651895;50.9680012078\n" +
               "Freiligrathstr.;6.9046671774;50.9196480289\n" +
               "Weserpromenade;6.8884154731;51.0326645858\n" +
               "Neißestr.;6.8938962584;51.0299814126\n" +
               "Havelstr.;6.8884916204;51.0270174528\n" +
               "Habichtstr.;6.9581092903;50.875960558\n" +
               "Neven DuMont Haus;6.9691130131;50.9739377495\n" +
               "Schulzentrum Wahn;7.0893171282;50.8629057112\n" +
               "Scheuermühlenstr.;7.1083063272;50.8573310842\n" +
               "Kaserne Haupttor;7.1129450911;50.8558171046\n" +
               "Deutzer Friedhof;6.9920930367;50.9255163957\n" +
               "Schanzenstr./Schauspielhaus;7.0098120995;50.9665228962\n" +
               "Köln/Bonn Flughafen;7.119959258;50.8791470924\n" +
               "Kartäuserhof;6.9585603837;50.9251806423\n" +
               "Schumacherring;6.8701860866;50.9840749247\n" +
               "Heinrich-Lübke-Ufer;6.9848255772;50.8999639655\n" +
               "Am Hochkreuz;7.0604243764;50.9028552593\n" +
               "Am Coloneum;6.8919304959;50.9891650589\n" +
               "CöllnParc;6.9216854844;50.9769374418\n" +
               "Voltastr.;7.0711866654;50.8832196815\n" +
               "Sparkasse Am Butzweilerhof;6.8886639131;50.9845861289\n" +
               "Schanzenstr. Nord;7.0168499251;50.9693899345\n" +
               "Celsiusstr.;7.0685366858;50.8820416522\n" +
               "Belvederestr.;6.8678288358;50.9506221505\n" +
               "Carlswerkstr.;7.0184860508;50.9653749712\n" +
               "Volksgarten;6.9511908119;50.9182803601\n" +
               "Zugweg;6.9565353048;50.916864443\n" +
               "Güterverkehrszentrum Süd;6.9186942182;50.8812377996\n" +
               "Paul-Nießen-Str.;6.9376832787;50.9120050111\n" +
               "Im Rheintal;6.9286638173;50.8559749797\n" +
               "Lüderichstr.;7.004227707;50.9276138152\n" +
               "Gummersbacher Str.;6.9889991312;50.9385073852\n" +
               "Corintostr.;6.9936556831;50.9411858859\n" +
               "Kalk-Karree;7.0029842744;50.9350442104\n" +
               "Christian-Sünner-Str.;7.0092523496;50.9344285363\n" +
               "Heinrich-Bützler-Str.;7.0106030093;50.935449954\n" +
               "Lentpark;6.9635517316;50.9578490625\n" +
               "Curt-Stenvert-Bogen;6.8288832842;50.9540455009\n" +
               "Gut Leidenhausen;7.097280162;50.896567117\n" +
               "Kallbergstr.;6.8833401174;51.0402209944\n" +
               "Oskar-Schindler-Str.;6.920183173;51.0325082617\n" +
               "Am Eifeltor;6.9171202881;50.8793536452\n" +
               "Ackerstr.;7.0172470209;50.9608618713\n" +
               "Klaprothstr.;7.0061616508;50.9485688488\n" +
               "Elisabeth-Breuer-Str.;7.0079472438;50.9598929747\n" +
               "Schützenhofstr.;7.0081866701;50.9701594707\n" +
               "Lina-Bommer-Weg;7.0483257158;50.9182046705\n" +
               "Hans-Offermann-Str.;7.0316847009;50.9256330222\n" +
               "Bertha-Benz-Karree;7.035967973;50.9256332199\n" +
               "Görlinger-Zentrum;6.8700921205;50.9805810937\n" +
               "Bugenhagenstr.;7.0241227188;50.9864486991\n" +
               "Am Flachsrosterweg;7.0222828972;50.9835462492\n" +
               "Heimfriedweg;7.0315856194;50.9839102787\n" +
               "Wupperplatz;7.0335854557;50.9901945331\n" +
               "Auenweg;6.9928000942;50.9557933379\n" +
               "Dillenburger Str.;7.0111564451;50.9340077991\n" +
               "Windmühlenstr.;6.9968887533;50.9577646456\n" +
               "Danzierstr.;7.0004240611;50.9592322188\n" +
               "Auf den Steinen;6.9898175521;50.908335934\n" +
               "In der Kreuzau;6.9939546636;50.907050766\n" +
               "Wasseramselweg;6.8765184083;50.9490497562\n" +
               "Weiden Lübecker Str.;6.8332409735;50.9336074903\n" +
               "Benfleetstr.;6.8428689939;50.9345210679\n" +
               "Unter Sachsenhausen;6.9529115914;50.9419091632\n" +
               "Offenbachplatz;6.9530599293;50.9378192389\n" +
               "Blaubach;6.9540085819;50.9322367941\n" +
               "Auf dem Berlich;6.9493470908;50.9410030771\n" +
               "IKEA Am Butzweilerhof;6.8945869742;50.9817780071\n" +
               "Alte Str.;6.8544650006;51.0556096608\n" +
               "Hürth-Kalscheuren Bf.;6.9109547402;50.8757548671\n" +
               "Am Kreuzweg;6.9216351208;50.8685835551\n" +
               "Rodenkirchener Str.;6.9141418219;50.8766134219\n" +
               "Blumenberg S-Bahn;6.8837060339;51.0376417496\n";
       String[] tmp = tmpS.split("\n");
       return tmp;
    }


    public ArrayList<Haltestellen_Koordinaten> formatCSV() throws IOException {
        String[] haltestellen = get(); //Array mit allen haltestellen und linien.
        boolean ready;
        for(int i = 0; i < haltestellen.length; i++) {
            ready = false;
            String[] tmp = haltestellen[i].split(";");
            Haltestellen_Koordinaten tmpH = new Haltestellen_Koordinaten(tmp[0], Double.valueOf(tmp[2]), Double.valueOf(tmp[1]));

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
                }
            }
        }
        return list;
    }
}
