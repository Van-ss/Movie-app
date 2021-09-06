package com.example.movies;
import java.util.ArrayList;

public class DataProvider {

    static String[] allMovies = {"John Wick", "Mission Impossible: Fallout", "Baby Driver", "Raiders of The Lost Ark",
            "Die Hard", "Kill Bill: Vol 1", "Heat", "Casino Royale", "The Dark Knight", "The Avengers", "A Quiet Place", "The Departed", "Parasite", "Gone Girl", "Silence of the Lambs",
            "Shutter Island", "Girl on the Train", "The Sixth Sense", "Jaws", "Knives Out", "Star Wars:A New Hope", "Jurassic Park", "Back To The Future", "The Martian", "Inception", "Ex Machina",
            "Terminator", "Gravity", "2001:A Space Odyssey", "Godzilla", "Crazy Rich Asians", "The Princess Bride", "Titanic", "La La Land", "Perks Of Being a Wallflower",
            "Eternal Sunshine Of The Spotless Mind", "To All The Boys I've Loved Before", "A Star Is Born",
            "Call Me By Your Name", "Lost In Translation", "Booksmart", "Superbad", "Mean Girls", "Ferris Bueller's Day Off",
            "Ghostbusters", "Shaun of the Dead", "Zombieland", "Bruce Almighty", "Easy A", "Lady Bird"};

    static String[] allDirectors = {"Chad Stahelski", "Christoper McQuarrie", "Edgar Wright", "Steven Spielberg",
            "John McTiernan", "Quentin Tarantino", "Michael Mann", "Martin Campbell", "Christoper Nolan", "Joss Whedon", "John Krasinski", "Martin Scorsese", "Bong Joon-Ho", "David Fincher",
            "Jonathan Demme", "Martin Scorsese", "Tate Taylor", "M.Night Shymalan", "Steven Spielberg", "Rian Johnson", "George Lucas", "Steven Spielberg", "Robert Zemeckis", "Ridley Scott",
            "Christoper Nolan", "Alex Garland", "James Cameron", "Alfonso Cuaron", "Stanley Kubric", "Gareth Edwards", "Jon M.Chu", "Rob Reiner", "James Cameron", "Damien Chazelle",
            "Stephen Chbosky", "Michel Gondry", "Susan Johnson", "Bradley Cooper", "Luca Guadagnino", "Sofia Coppola", "Olivia Wilde", "Greg Mottola", "Mark Waters", "John Hughes",
            "Ivan Reitman", "Edgar Wright", "Ruben Fleischer", "Tom Shadyac", "Will Gluck", "Greta Gerwig"};


    static String[] allYears = {"2014","2018","2017","1981","1988","2003","1996","2006","2008","2012","2018","2006","2019","2014","1991","2010","2016","1999","1975","2019",
            "1977","1993","1985","2015","2010","2015","1987","2013","1966","2014","2018","1987","1997","2016","2013","2004","2018","2018","2017","2003","2019","2007","2004","1986","1984","2004","2009","2003","2010","2018"};

    static int[] topViews = {0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0};

    static int[] allId = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49};

    static int[][]  slideImages = {{R.drawable.act1_1,R.drawable.act1_2,R.drawable.act1_3},{R.drawable.act2_1,R.drawable.act2_2,R.drawable.act2_3},{R.drawable.act3_1,R.drawable.act3_2,R.drawable.act3_3},{R.drawable.act4_1,R.drawable.act4_2,R.drawable.act4_3},{R.drawable.act5_1,R.drawable.act5_2,R.drawable.act5_3},{R.drawable.act6_1,R.drawable.act6_2,R.drawable.act6_3},{R.drawable.act7_1,R.drawable.act7_2,R.drawable.act7_3},{R.drawable.act8_1,R.drawable.act8_2,R.drawable.act8_3},{R.drawable.act9_1,R.drawable.act9_2,R.drawable.act9_3},{R.drawable.act10_1,R.drawable.act10_2,R.drawable.act10_3},
            {R.drawable.thriller1_1,R.drawable.thriller1_2,R.drawable.thriller1_3},{R.drawable.thriller2_1,R.drawable.thriller2_2,R.drawable.thriller2_3},{R.drawable.thriller3_1,R.drawable.thriller3_2,R.drawable.thriller3_3},{R.drawable.thriller4_1,R.drawable.thriller4_2,R.drawable.thriller4_3},{R.drawable.thriller5_1,R.drawable.thriller5_2,R.drawable.thriller5_3},{R.drawable.thriller6_1,R.drawable.thriller6_2,R.drawable.thriller6_3},{R.drawable.thriller7_1,R.drawable.thriller7_2,R.drawable.thriller7_3},{R.drawable.thriller8_1,R.drawable.thriller8_2,R.drawable.thriller8_3},{R.drawable.thriller9_1,R.drawable.thriller9_2,R.drawable.thriller9_3},{R.drawable.thriller10_1,R.drawable.thriller10_2,R.drawable.thriller10_3},
            {R.drawable.scifi10_1,R.drawable.scifi10_2,R.drawable.scifi10_3},{R.drawable.scifi1_1,R.drawable.scifi1_2,R.drawable.scifi1_3},{R.drawable.scifi2_1,R.drawable.scifi2_2,R.drawable.scifi2_3},{R.drawable.scifi3_1,R.drawable.scifi3_2,R.drawable.scifi3_3},{R.drawable.scifi4_1,R.drawable.scifi4_2,R.drawable.scifi4_3},{R.drawable.scifi5_1,R.drawable.scifi5_2,R.drawable.scifi5_3},{R.drawable.scifi6_1,R.drawable.scifi6_2,R.drawable.scifi6_3},{R.drawable.scifi7_1,R.drawable.scifi7_2,R.drawable.scifi7_3},{R.drawable.scifi8_1,R.drawable.scifi8_2,R.drawable.scifi8_3},{R.drawable.scifi9_1,R.drawable.scifi9_2,R.drawable.scifi9_3},
            {R.drawable.rom1_1,R.drawable.rom1_2,R.drawable.rom1_3},{R.drawable.rom2_1,R.drawable.rom2_2,R.drawable.rom2_3},{R.drawable.rom3_1,R.drawable.rom3_2,R.drawable.rom3_3},{R.drawable.rom4_1,R.drawable.rom4_2,R.drawable.rom4_3},{R.drawable.rom5_1,R.drawable.rom5_2,R.drawable.rom5_3},{R.drawable.rom6_1,R.drawable.rom6_2,R.drawable.rom6_3},{R.drawable.rom7_1,R.drawable.rom7_2,R.drawable.rom7_3},{R.drawable.rom8_1,R.drawable.rom8_2,R.drawable.rom8_3},{R.drawable.rom9_1,R.drawable.rom9_2,R.drawable.rom9_3},{R.drawable.rom10_2,R.drawable.rom10_1,R.drawable.rom10_3},
            {R.drawable.come1_1,R.drawable.come1_2,R.drawable.come1_3},{R.drawable.come2_1,R.drawable.come2_2,R.drawable.come2_3},{R.drawable.come3_1,R.drawable.come3_2,R.drawable.come3_3},{R.drawable.come4_1,R.drawable.come4_2,R.drawable.come4_3},{R.drawable.come5_1,R.drawable.come5_2,R.drawable.come5_3},{R.drawable.come6_1,R.drawable.come6_2,R.drawable.come6_3},{R.drawable.come7_1,R.drawable.come7_2,R.drawable.come7_3},{R.drawable.come8_1,R.drawable.come8_2,R.drawable.come8_3},{R.drawable.come9_1,R.drawable.come9_2,R.drawable.come9_3},{R.drawable.come10_1,R.drawable.come10_2,R.drawable.come10_3}};

    static int[] allCovers = {R.drawable.act1, R.drawable.act2, R.drawable.act3, R.drawable.act4, R.drawable.act5, R.drawable.act6, R.drawable.act7, R.drawable.act8,
            R.drawable.act9, R.drawable.act10, R.drawable.thriller1, R.drawable.thriller2, R.drawable.thriller3, R.drawable.thriller4, R.drawable.thriller5, R.drawable.thriller6, R.drawable.thriller7, R.drawable.thriller8,
            R.drawable.thriller9, R.drawable.thriller10, R.drawable.scifi10, R.drawable.scifi1, R.drawable.scifi2, R.drawable.scifi3, R.drawable.scifi4, R.drawable.scifi5, R.drawable.scifi6, R.drawable.scifi7,
            R.drawable.scifi8, R.drawable.scifi9, R.drawable.rom1, R.drawable.rom2, R.drawable.rom3, R.drawable.rom4, R.drawable.rom5, R.drawable.rom6, R.drawable.rom7, R.drawable.rom8,
            R.drawable.rom9, R.drawable.rom10, R.drawable.come1, R.drawable.come2, R.drawable.come3, R.drawable.come4, R.drawable.come5, R.drawable.come6, R.drawable.come7, R.drawable.come8,
            R.drawable.come9, R.drawable.come10};

    static String[] allPrices = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};

    static String[] allDescriptions = {"Legendary assassin John Wick (Keanu Reeves) retired from his violent career after marrying the love of his life. Her sudden death leaves John in deep mourning. When sadistic mobster Iosef Tarasov (Alfie Allen) and his thugs steal John's prized car and kill the puppy that was a last gift from his wife, John unleashes the remorseless killing machine within and seeks vengeance. Meanwhile, Iosef's father (Michael Nyqvist) -- John's former colleague -- puts a huge bounty on John's head.",
            "Ethan Hunt and the IMF team join forces with CIA assassin August Walker to prevent a disaster of epic proportions. Arms dealer John Lark and a group of terrorists known as the Apostles plan to use three plutonium cores for a simultaneous nuclear attack on the Vatican, Jerusalem and Mecca, Saudi Arabia. When the weapons go missing, Ethan and his crew find themselves in a desperate race against time to prevent them from falling into the wrong hands.",
            "Talented getaway driver Baby (Ansel Elgort) relies on the beat of his personal soundtrack to be the best in the game. After meeting the woman (Lily James) of his dreams, he sees a chance to ditch his shady lifestyle and make a clean break. Coerced into working for a crime boss (Kevin Spacey), Baby must face the music as a doomed heist threatens his life, love and freedom.",
            "Dr. Indiana Jones (Harrison Ford), a renowned archeologist and expert in the occult, is hired by the U.S. Government to find the ark of the covenant, which is believed to still hold the Ten Commandments. Unfortunately, Hitler's agents are also after the ark. Indy and his ex-flame Marion escape from various close scrapes in a quest that takes them from Nepal to Cairo.",
            "New York City policeman John McClane (Bruce Willis) is visiting his estranged wife (Bonnie Bedelia) and two daughters on Christmas Eve. He joins her at a holiday party in the headquarters of the Japanese-owned business she works for. But the festivities are interrupted by a group of terrorists who take over the exclusive high-rise, and everyone in it. Very soon McClane realizes that there's no one to save the hostages -- but him.",
            "A former assassin, known simply as The Bride (Uma Thurman), wakes from a coma four years after her jealous ex-lover Bill (David Carradine) attempts to murder her on her wedding day. Fueled by an insatiable desire for revenge, she vows to get even with every person who contributed to the loss of her unborn child, her entire wedding party, and four years of her life. After devising a hit list, The Bride sets off on her quest, enduring unspeakable injury and unscrupulous enemies.",
            "Master criminal Neil McCauley (Robert De Niro) is trying to control the rogue actions of one of his men, while also planning one last big heist before retiring. Meanwhile, Lieutenant Hanna (Al Pacino) attempts to track down McCauley as he deals with the chaos in his own life, including the infidelity of his wife (Diane Venora) and the mental health of his stepdaughter (Natalie Portman). McCauley and Hanna discover a mutual respect, even as they try to thwart each other's plans.",
            "After receiving a license to kill, British Secret Service agent James Bond (Daniel Craig) heads to Madagascar, where he uncovers a link to Le Chiffre (Mads Mikkelsen), a man who finances terrorist organizations. Learning that Le Chiffre plans to raise money in a high-stakes poker game, MI6 sends Bond to play against him, gambling that their newest 00 operative will topple the man's organization",
            "With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.",
            "When Thor's evil brother, Loki (Tom Hiddleston), gains access to the unlimited power of the energy cube called the Tesseract, Nick Fury (Samuel L. Jackson), director of S.H.I.E.L.D., initiates a superhero recruitment effort to defeat the unprecedented threat to Earth. Joining Fury's 'dream team' are Iron Man (Robert Downey Jr.), Captain America (Chris Evans), the Hulk (Mark Ruffalo), Thor (Chris Hemsworth), the Black Widow (Scarlett Johansson) and Hawkeye (Jeremy Renner).",
            "If they hear you, they hunt you. A family must live in silence to avoid mysterious creatures that hunt by sound. Knowing that even the slightest whisper or footstep can bring death, Evelyn (Emily Blunt) and Lee are determined to find a way to protect their children while desperately searching for a way to fight back.",
            "South Boston cop Billy Costigan (Leonardo DiCaprio) goes under cover to infiltrate the organization of gangland chief Frank Costello (Jack Nicholson). As Billy gains the mobster's trust, a career criminal named Colin Sullivan (Matt Damon) infiltrates the police department and reports on its activities to his syndicate bosses. When both organizations learn they have a mole in their midst, Billy and Colin must figure out each other's identities to save their own lives.",
            "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
            "In Carthage, Mo., former New York-based writer Nick Dunne (Ben Affleck) and his glamorous wife Amy (Rosamund Pike) present a portrait of a blissful marriage to the public. However, when Amy goes missing on the couple's fifth wedding anniversary, Nick becomes the prime suspect in her disappearance. The resulting police pressure and media frenzy cause the Dunnes' image of a happy union to crumble, leading to tantalizing questions about who Nick and Amy truly are.",
            "Jodie Foster stars as Clarice Starling, a top student at the FBI's training academy. Jack Crawford (Scott Glenn) wants Clarice to interview Dr. Hannibal Lecter (Anthony Hopkins), a brilliant psychiatrist who is also a violent psychopath, serving life behind bars for various acts of murder and cannibalism. Crawford believes that Lecter may have insight into a case and that Starling, as an attractive young woman, may be just the bait to draw him out.",
            "The implausible escape of a brilliant murderess brings U.S. Marshal Teddy Daniels (Leonardo DiCaprio) and his new partner (Mark Ruffalo) to Ashecliffe Hospital, a fortress-like insane asylum located on a remote, windswept island. The woman appears to have vanished from a locked room, and there are hints of terrible deeds committed within the hospital walls. As the investigation deepens, Teddy realizes he will have to confront his own dark fears if he hopes to make it off the island alive.",
            "Commuter Rachel Watson (Emily Blunt) catches daily glimpses of a seemingly perfect couple, Scott and Megan, from the window of her train. One day, Watson witnesses something shocking unfold in the backyard of the strangers' home. Rachel tells the authorities what she thinks she saw after learning that Megan is now missing and feared dead. Unable to trust her own memory, the troubled woman begins her own investigation, while police suspect that Rachel may have crossed a dangerous line.",
            "Young Cole Sear (Haley Joel Osment) is haunted by a dark secret: he is visited by ghosts. Cole is frightened by visitations from those with unresolved problems who appear from the shadows. He is too afraid to tell anyone about his anguish, except child psychologist Dr. Malcolm Crowe (Bruce Willis). As Dr. Crowe tries to uncover the truth about Cole's supernatural abilities, the consequences for client and therapist are a jolt that awakens them both to something unexplainable.",
            "When a young woman is killed by a shark while skinny-dipping near the New England tourist town of Amity Island, police chief Martin Brody (Roy Scheider) wants to close the beaches, but mayor Larry Vaughn (Murray Hamilton) overrules him, fearing that the loss of tourist revenue will cripple the town. Ichthyologist Matt Hooper (Richard Dreyfuss) and grizzled ship captain Quint (Robert Shaw) offer to help Brody capture the killer beast, and the trio engage in an epic battle of man vs. nature.",
            "The circumstances surrounding the death of crime novelist Harlan Thrombey are mysterious, but there's one thing that renowned Detective Benoit Blanc (Daniel Craig) knows for sure -- everyone in the wildly dysfunctional Thrombey family is a suspect. Now, Blanc must sift through a web of lies and red herrings to uncover the truth.",
            "The Imperial Forces, under orders from cruel Darth Vader (David Prowse), hold Princess Leia (Carrie Fisher) hostage, in their efforts to quell the rebellion against the Galactic Empire. Luke Skywalker (Mark Hamill) and Han Solo (Harrison Ford), captain of the Millennium Falcon, work together with the companionable droid duo R2-D2 and C-3PO to rescue the beautiful princess, help the Rebel Alliance, and restore freedom and justice to the Galaxy.",
            "In Steven Spielberg's massive blockbuster, paleontologists Alan Grant (Sam Neill) and Ellie Sattler (Laura Dern) and mathematician Ian Malcolm (Jeff Goldblum) are among a select group chosen to tour an island theme park populated by dinosaurs created from prehistoric DNA. While the park's mastermind, billionaire John Hammond (Richard Attenborough), assures everyone that the facility is safe, they find out otherwise when various ferocious predators break free and go on the hunt.",
            "In this 1980s sci-fi classic, small-town California teen Marty McFly is thrown back into the '50s when an experiment by his eccentric scientist friend Doc Brown goes awry. Traveling through time in a modified DeLorean car, Marty encounters young versions of his parents, and must make sure that they fall in love or he'll cease to exist. Even more dauntingly, Marty has to return to his own time and save the life of Doc Brown.",
            "When astronauts blast off from the planet Mars, they leave behind Mark Watney (Matt Damon), presumed dead after a fierce storm. With only a meager amount of supplies, the stranded visitor must utilize his wits and spirit to find a way to survive on the hostile planet. Meanwhile, back on Earth, members of NASA and a team of international scientists work tirelessly to bring him home, while his crew mates hatch their own plan for a daring rescue mission.",
            "Dom Cobb (Leonardo DiCaprio) is a thief with the rare ability to enter people's dreams and steal their secrets from their subconscious. His skill has made him a hot commodity in the world of corporate espionage but has also cost him everything he loves. Cobb gets a chance at redemption when he is offered a seemingly impossible task: Plant an idea in someone's mind. If he succeeds, it will be the perfect crime, but a dangerous enemy anticipates Cobb's every move.",
            "Caleb Smith (Domhnall Gleeson) a programmer at a huge Internet company, wins a contest that enables him to spend a week at the private estate of Nathan Bateman (Oscar Isaac), his firm's brilliant CEO. When he arrives, Caleb learns that he has been chosen to be the human component in a Turing test to determine the capabilities and consciousness of Ava (Alicia Vikander), a beautiful robot. However, it soon becomes evident that Ava is far more self-aware and deceptive than either man imagined.",
            "Disguised as a human, a cyborg assassin known as a Terminator (Arnold Schwarzenegger) travels from 2029 to 1984 to kill Sarah Connor (Linda Hamilton). Sent to protect Sarah is Kyle Reese (Michael Biehn), who divulges the coming of Skynet, an artificial intelligence system that will spark a nuclear holocaust. Sarah is targeted because Skynet knows that her unborn son will lead the fight against them. With the virtually unstoppable Terminator in hot pursuit, she and Kyle attempt to escape.",
            "Dr. Ryan Stone (Sandra Bullock) is a medical engineer on her first shuttle mission. Her commander is veteran astronaut Matt Kowalsky (George Clooney), helming his last flight before retirement. Then, during a routine space walk by the pair, disaster strikes: The shuttle is destroyed, leaving Ryan and Matt stranded in deep space with no link to Earth and no hope of rescue. As fear turns to panic, they realize that the only way home may be to venture further into space.",
            "An imposing black structure provides a connection between the past and the future in this enigmatic adaptation of a short story by revered sci-fi author Arthur C. Clarke. When Dr. Dave Bowman (Keir Dullea) and other astronauts are sent on a mysterious mission, their ship's computer system, HAL, begins to display increasingly strange behavior, leading up to a tense showdown between man and machine that results in a mind-bending trek through space and time.",
            "Ford Brody (Aaron Taylor-Johnson), a Navy bomb expert, has just reunited with his family in San Francisco when he is forced to go to Japan to help his estranged father, Joe (Bryan Cranston). Soon, both men are swept up in an escalating crisis when Godzilla, King of the Monsters, arises from the sea to combat malevolent adversaries that threaten the survival of humanity. The creatures leave colossal destruction in their wake, as they make their way toward their final battleground: San Francisco.",
            "Rachel Chu is happy to accompany her longtime boyfriend, Nick, to his best friend's wedding in Singapore. She's also surprised to learn that Nick's family is extremely wealthy and he's considered one of the country's most eligible bachelors. Thrust into the spotlight, Rachel must now contend with jealous socialites, quirky relatives and something far, far worse -- Nick's disapproving mother.",
            "A fairy tale adventure about a beautiful young woman and her one true love. He must find her after a long separation and save her. They must battle the evils of the mythical kingdom of Florin to be reunited with each other. Based on the William Goldman novel 'The Princess Bride' which earned its own loyal audience.",
            "James Cameron's 'Titanic' is an epic, action-packed romance set against the ill-fated maiden voyage of the R.M.S. Titanic; the pride and joy of the White Star Line and, at the time, the largest moving object ever built. She was the most luxurious liner of her era -- the 'ship of dreams' -- which ultimately carried over 1,500 people to their death in the ice cold waters of the North Atlantic in the early hours of April 15, 1912.",
            "Sebastian (Ryan Gosling) and Mia (Emma Stone) are drawn together by their common desire to do what they love. But as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.",
            "Socially awkward teen Charlie (Logan Lerman) is a wallflower, always watching life from the sidelines, until two charismatic students become his mentors. Free-spirited Sam (Emma Watson) and her stepbrother Patrick (Ezra Miller) help Charlie discover the joys of friendship, first love, music and more, while a teacher sparks Charlie's dreams of becoming a writer. However, as his new friends prepare to leave for college, Charlie's inner sadness threatens to shatter his newfound confidence.",
            "After a painful breakup, Clementine (Kate Winslet) undergoes a procedure to erase memories of her former boyfriend Joel (Jim Carrey) from her mind. When Joel discovers that Clementine is going to extremes to forget their relationship, he undergoes the same procedure and slowly begins to forget the woman that he loved. Directed by former music video director Michel Gondry, the visually arresting film explores the intricacy of relationships and the pain of loss.",
            "Lara Jean Covey writes letters to all of her past loves, the letters are meant for her eyes only. Until one day when all the love letters are sent out to her previous loves. Her life is soon thrown into chaos when her foregoing loves confront her one by one.",
            "Seasoned musician Jackson Maine discovers -- and falls in love with -- struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jackson coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jackson fights an ongoing battle with his own internal demons.",
            "It's the summer of 1983, and precocious 17-year-old Elio Perlman is spending the days with his family at their 17th-century villa in Lombardy, Italy. He soon meets Oliver, a handsome doctoral student who's working as an intern for Elio's father. Amid the sun-drenched splendor of their surroundings, Elio and Oliver discover the heady beauty of awakening desire over the course of a summer that will alter their lives forever.",
            "A lonely, aging movie star named Bob Harris (Bill Murray) and a conflicted newlywed, Charlotte (Scarlett Johansson), meet in Tokyo. Bob is there to film a Japanese whiskey commercial; Charlotte is accompanying her celebrity-photographer husband. Strangers in a foreign land, the two find escape, distraction and understanding amidst the bright Tokyo lights after a chance meeting in the quiet lull of the hotel bar. They form a bond that is as unlikely as it is heartfelt and meaningful.",
            "Academic overachievers Amy (Kaitlyn Dever) and Molly (Beanie Feldstien) thought keeping their noses to the grindstone gave them a leg up on their high school peers. But on the eve of graduation, the best friends suddenly realize that they may have missed out on the special moments of their teenage years. Determined to make up for lost time, the girls decide to cram four years of not-to-be missed fun into one night -- a chaotic adventure that no amount of book smarts could prepare them for.",
            "High-school seniors Seth (Jonah Hill) and Evan (Michael Cera) have high hopes for a graduation party: The co-dependent teens plan to score booze and babes so they can become part of the in-crowd, but separation anxiety and two bored police officers (Bill Hader, Seth Rogen) complicate the pair's self-proclaimed mission.",
            "Teenage Cady Heron (Lindsay Lohan) was educated in Africa by her scientist parents. When her family moves to the suburbs of Illinois, Cady finally gets to experience public school and gets a quick primer on the cruel, tacit laws of popularity that divide her fellow students into tightly knit cliques. She unwittingly finds herself in the good graces of an elite group of cool students dubbed the Plastics, but Cady soon realizes how her shallow group of new friends earned this nickname.",
            "Ferris Bueller (Matthew Broderick) has an uncanny skill at cutting classes and getting away with it. Intending to make one last duck-out before graduation, Ferris calls in sick, 'borrows' a Ferrari, and embarks on a one-day journey through the streets of Chicago. On Ferris' trail is high school principal Rooney (Jeffrey Jones), determined to catch him in the act.",
            "After the members of a team of scientists (Harold Ramis, Dan Aykroyd, Bill Murray) lose their cushy positions at a university in New York City, they decide to become 'ghostbusters' to wage a high-tech battle with the supernatural for money. They stumble upon a gateway to another dimension, a doorway that will release evil upon the city. The Ghostbusters must now save New York from complete destruction.",
            "Shaun (Simon Pegg) is a 30-something loser with a dull, easy existence. When he's not working at the electronics store, he lives with his slovenly best friend, Ed (Nick Frost), in a small flat on the outskirts of London. The only unpredictable element in his life is his girlfriend, Liz (Kate Ashfield), who wishes desperately for Shaun to grow up and be a man. When the town is inexplicably overrun with zombies, Shaun must rise to the occasion and protect both Liz and his mother (Penelope Wilton).",
            "After a virus turns most people into zombies, the world's surviving humans remain locked in an ongoing battle against the hungry undead. Four survivors -- Tallahassee (Woody Harrelson) and his cohorts Columbus (Jesse Eisenberg), Wichita (Emma Stone) and Little Rock (Abigail Breslin) -- abide by a list of survival rules and zombie-killing strategies as they make their way toward a rumored safe haven in Los Angeles.",
            "Bruce Nolan's (Jim Carrey) career in TV has been stalled for a while, and when he's passed over for a coveted anchorman position, he loses it, complaining that God is treating him poorly. Soon after, God (Morgan Freeman) actually contacts Bruce and offers him all of his powers if he thinks he can do a better job. Bruce accepts and goes on a spree, using his new-found abilities for selfish, personal use until he realizes that the prayers of the world are going unanswered.",
            "Prompted by her popular best friend to spill details of her boring weekend, Olive (Emma Stone), a clean-cut teen, decides to spice things up by telling a little lie about losing her virginity. When the high-school busybody (Amanda Bynes) overhears the conversation and spreads it all over campus, Olive is suddenly notorious but for the wrong reasons",
            "A teenager (Saoirse Ronan) navigates a loving but turbulent relationship with her strong-willed mother (Laurie Metcalf) over the course of an eventful and poignant senior year of high school."};

    static String[] allGenre = {"Action", "Action", "Action", "Action", "Action", "Action", "Action", "Action", "Action", "Action", "Thriller", "Thriller", "Thriller", "Thriller", "Thriller"
            , "Thriller", "Thriller", "Thriller", "Thriller", "Thriller", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Sci-Fi", "Romance", "Romance", "Romance",
            "Romance", "Romance", "Romance", "Romance", "Romance", "Romance", "Romance", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy", "Comedy"};

    static String[] allTrailers = {"https://www.youtube.com/watch?v=C0BMx-qxsP4", "https://www.youtube.com/watch?v=wb49-oV0F78", "https://www.youtube.com/watch?v=D9YZw_X5UzQ", "https://www.youtube.com/watch?v=XkkzKHCx154", "https://www.youtube.com/watch?v=jaJuwKCmJbY", "https://www.youtube.com/watch?v=7kSuas6mRpk", "https://www.youtube.com/watch?v=0xbBLJ1WGwQ", "https://www.youtube.com/watch?v=36mnx8dBbGE", "https://www.youtube.com/watch?v=EXeTwQWrcwY", "https://www.youtube.com/watch?v=eOrNdBpGMv8", "https://www.youtube.com/watch?v=WR7cc5t7tv8", "https://www.youtube.com/watch?v=iojhqm0JTW4", "https://www.youtube.com/watch?v=5xH0HfJHsaY", "https://www.youtube.com/watch?v=2-_-1nJf8Vg", "https://www.youtube.com/watch?v=W6Mm8Sbe__o"
            , "https://www.youtube.com/watch?v=5iaYLCiq5RM", "https://www.youtube.com/watch?v=y5yk-HGqKmM", "https://www.youtube.com/watch?v=3-ZP95NF_Wk", "https://www.youtube.com/watch?v=U1fu_sA7XhE", "https://www.youtube.com/watch?v=sL-9Khv7wa4", "https://www.youtube.com/watch?v=XHk5kCIiGoM", "https://www.youtube.com/watch?v=lc0UehYemQA", "https://www.youtube.com/watch?v=qvsgGtivCgs", "https://www.youtube.com/watch?v=ej3ioOneTy8", "https://www.youtube.com/watch?v=YoHD9XEInc0", "https://www.youtube.com/watch?v=EoQuVnKhxaM", "https://www.youtube.com/watch?v=k64P4l2Wmeg", "https://www.youtube.com/watch?v=OiTiKOy59o4", "https://www.youtube.com/watch?v=oR_e9y-bka0", "https://www.youtube.com/watch?v=vIu85WQTPRc", "https://www.youtube.com/watch?v=ZQ-YX-5bAs0", "https://www.youtube.com/watch?v=O3CIXEAjcc8", "https://www.youtube.com/watch?v=kVrqfYjkTdQ",
            "https://www.youtube.com/watch?v=0pdqf4P9MB8", "https://www.youtube.com/watch?v=2vb2qrcPEEs", "https://www.youtube.com/watch?v=07-QBnEkgXU", "https://www.youtube.com/watch?v=555oiY9RWM4", "https://www.youtube.com/watch?v=nSbzyEJ8X9E", "https://www.youtube.com/watch?v=Z9AYPxH5NTM", "https://www.youtube.com/watch?v=g_maEh38ZTw", "https://www.youtube.com/watch?v=Uhd3lo_IWJc", "https://www.youtube.com/watch?v=4eaZ_48ZYog", "https://www.youtube.com/watch?v=oDU84nmSDZY", "https://www.youtube.com/watch?v=K-X2XzKqBiE", "https://www.youtube.com/watch?v=6hDkhw5Wkas", "https://www.youtube.com/watch?v=LIfcaZ4pC-4", "https://www.youtube.com/watch?v=8m9EVP8X7N8", "https://www.youtube.com/watch?v=fe-luzrqWSk", "https://www.youtube.com/watch?v=KNbPnqyvItk", "https://www.youtube.com/watch?v=cNi_HC839Wo"};


    public static void topPicks(int id) {
        topViews[id] += 1;
    }


    public static ArrayList<Movies> topPicks() {
        ArrayList<Movies> Movies = new ArrayList<>();//Get Top 5 Most Viewed Items
        int maxOne = 0;
        int maxTwo = 0;
        int maxThree = 0;
        int maxFour = 0;
        int maxFive = 0;

        for (int i = 0; i < topViews.length; i++) {
            if (topViews[i] > maxOne) {
                maxFive = maxFour;
                maxFour = maxThree;
                maxThree = maxTwo;
                maxTwo = maxOne;
                maxOne = i;

            } else if (topViews[i] > maxTwo) {
                maxFive = maxFour;
                maxFour = maxThree;
                maxThree = maxTwo;
                maxTwo = i;
            } else if (topViews[i] > maxThree) {
                maxFive = maxFour;
                maxFour = maxThree;
                maxThree = i;
            } else if (topViews[i] > maxFour) {
                maxFive = maxFour;
                maxFour = i;
            } else if (topViews[i] > maxFive) {
                maxFive = i;
            }
        }
        for (int i = 0; i < topViews.length; i++) {
            if ((allId[i] == maxOne) || (allId[i] == maxTwo) || (allId[i] == maxThree) || (allId[i] == maxFour) || (allId[i] == maxFive)) {
                int id = allId[i];
                String title = allMovies[i];
                String price = allPrices[i];
                String director = allDirectors[i];
                String year = allYears[i];
                String genres = allGenre[i];
                int[] slideImage = slideImages[i];
                int images = allCovers[i];
                String description = allDescriptions[i];
                String trailer = allTrailers[i];

                Movies tempItem = new Movies(id, title, price, genres, images, description, director, year, slideImage, trailer);
                Movies.add(tempItem);
            }
        }
        return Movies;
    }

    public static ArrayList<Movies> generateDataNew(String genre) {//Get Movies depending on genre
        ArrayList<Movies> Movies = new ArrayList<>();
        for (int i = 0; i < allGenre.length; i++) {
            if (genre.equals(allGenre[i])) {
                int id = allId[i];
                String title = allMovies[i];
                String price = allPrices[i];
                String director = allDirectors[i];
                String year = allYears[i];
                String genres = allGenre[i];
                int[] slideImage = slideImages[i];
                int images = allCovers[i];
                String description = allDescriptions[i];
                String trailer = allTrailers[i];

                Movies tempItem = new Movies(id, title, price, genres, images, description, director, year, slideImage, trailer);
                Movies.add(tempItem);
            }
        }

        return Movies;

    }

    public static ArrayList<Movies> searchFunction() {//Displays All Movies for Search
        ArrayList<Movies> Movies = new ArrayList<>();
        for (int i = 0; i < allGenre.length; i++) {
            int id = allId[i];
            String title = allMovies[i];
            String price = allPrices[i];
            String director = allDirectors[i];
            String year = allYears[i];
            String genres = allGenre[i];
            int[] slideImage = slideImages[i];
            int images = allCovers[i];
            String description = allDescriptions[i];
            String trailer = allTrailers[i];

            Movies tempItem = new Movies(id, title, price, genres, images, description, director, year, slideImage, trailer);
            Movies.add(tempItem);
        }

        return Movies;

    }
}



