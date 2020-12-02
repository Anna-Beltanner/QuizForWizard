package com.quizforwizard

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Who is Harry Potter's godfather?",
            "Sirius Black",
            "Remus Lupin",
            "Peter Pettigrew",
            "Severus Snape",
            1
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Which class has a different teacher every year?",
            "Transfiguration",
            "Care of Magical Creatures",
            "Defence against the Dark Art",
            "Potions",
            3
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "What animal is a symbol of Hufflepuff house?",
            "Eagle",
            "Badger",
            "Lion",
            "Serpent",
            2
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "What subject did Hagrid teach?",
            "Potions",
            "Defence against the Dark Art",
            "Transfiguration",
            "Care of Magical Creatures",
            4
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "Who took Fleur Delacour to the Yule Ball?",
            "Fred Weasley",
            "George Weasley",
            "Roger Davies",
            "Viktor Krum",
            3
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "Who took Ginny Weasley to the Yule Ball?",
            "Neville Longbottom",
            "Dean Thomas",
            "Cormac McLaggen",
            "Harry Potter",
            1
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "What is Cho Chang's favorite Quidditch team?",
            "Chudley Cannons",
            "Puddlemere United",
            "Tutshill Tornados",
            "Holyhead Harpies",
            3
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "Who took Lavender Brown to the Yule Ball?",
            "Seamus Finnigan",
            "Fred Weasley",
            "Roger Davies",
            "Dean Thomas",
            1
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "Who was Ron Weasley’s girlfriend in the six year?",
            "Parvati Patil",
            "Padma Patil",
            "Lavender Brown",
            "Hermione Granger",
            3
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "Who is Teddy Lupin's godfather?",
            "Harry Potter",
            "Ron Weasley",
            "George Weasley",
            "Dean Thomas",
            1
        )
        questionList.add(question10)

        val question11 = Question(
            11,
            "What is Seamus Finnigan’s Patronus?",
            "Jack Russell terrier",
            "Stag",
            "Fox",
            "Hare",
            3
        )
        questionList.add(question11)

        val question12 = Question(
            12,
            "Which type of insect is Ronald Weasley most afraid of?",
            "Spider",
            "Wasp",
            "Bee",
            "Fly",
            1
        )
        questionList.add(question12)

        val question13 = Question(
            13,
            "What is Fleur Delacour's young sister name?",
            "Brigitte",
            "Gabrielle",
            "Isabelle",
            "Michele",
            2
        )
        questionList.add(question13)

        val question14 = Question(
            14,
            "What is Luna Lovegood’s Patronus?",
            "Stag",
            "Otter",
            "Horse",
            "Hare",
            4
        )
        questionList.add(question14)

        val question15 = Question(
            15,
            "Which Quidditch team did Oliver Wood play for after leaving Hogwarts?",
            "Wimbourne Wasps",
            "Tutshill Tornados",
            "Puddlemere United",
            "Chudley Cannons",
            3
        )
        questionList.add(question15)

        val question16 = Question(
            16,
            "What is Ginny Weasley’s Patronus?",
            "Stag",
            "Horse",
            "Jack Russell terrier",
            "Otter",
            2
        )
        questionList.add(question16)

        val question17 = Question(
            17,
            "What Hogwarts house was Lily Evans in?",
            "Gryffindor",
            "Ravenclaw",
            "Hufflepuff",
            "Slytherin",
            1
        )
        questionList.add(question17)

        val question18 = Question(
            18,
            "What is Severus Snape’s Patronus?",
            "Jack Russell terrier",
            "Otter",
            "Doe",
            "Stag",
            3
        )
        questionList.add(question18)

        val question19 = Question(
            19,
            "Which student served as a Quidditch commentator?",
            "Dean Thomas",
            "George Weasley",
            "Seamus Finnigan",
            "Lee Jordan",
            4
        )
        questionList.add(question19)

        val question20 = Question(
            20,
            "What animal is a symbol of Ravenclaw house?",
            "Badger",
            "Eagle",
            "Serpent",
            "Lion",
            2
        )
        questionList.add(question20)

        val question21 = Question(
            21,
            "Which Quidditch team did Ludo Bagman play for when he was young?",
            "Puddlemere United",
            "Tutshill Tornados",
            "Wimbourne Wasps",
            "Chudley Cannons",
            3
        )
        questionList.add(question21)

        val question22 = Question(
            22,
            "What is the name of Hermione's pet cat?",
            "Crookshanks",
            "Scabbers",
            "Pigwidgeon",
            "Hedwig",
            1
        )
        questionList.add(question22)

        val question23 = Question(
            23,
            "What's Harry Potter position on the Quidditch team?",
            "Chaser",
            "Seeker",
            "Keeper",
            "Beater",
            2
        )
        questionList.add(question23)

        val question24 = Question(
            24,
            "What's Angelina Johnson's position on the Quidditch team?",
            "Chaser",
            "Seeker",
            "Keeper",
            "Beater",
            1
        )
        questionList.add(question24)

        val question25 = Question(
            25,
            "What is the name of Ron Weasley's small owl?",
            "Hedwig",
            "Scabbers",
            "Crookshanks",
            "Pigwidgeon",
            4
        )
        questionList.add(question25)

        val question26 = Question(
            26,
            "What is Tom Riddle’s middle name?",
            "Severus",
            "Salazar",
            "Ignotus",
            "Marvolo",
            4
        )
        questionList.add(question26)

        val question27 = Question(
            27,
            "What's the name of Colin Creevey's brother?",
            "Cormac",
            "Seamus",
            "Dean",
            "Dennis",
            4
        )
        questionList.add(question27)

        val question28 = Question(
            28,
            "What's the name of Tom Riddle's mother?",
            "Merope",
            "Narcissa",
            "Bellatrix",
            "Eileen",
            1
        )
        questionList.add(question28)

        val question29 = Question(
            29,
            "What is the name of Albus Dumbledore’s sister?",
            "Patricia",
            "Sybill",
            "Ariana",
            "Minerva ",
            3
        )
        questionList.add(question29)

        val question30 = Question(
            30,
            "What Hogwarts house was Lucius Malfoy in?",
            "Gryffindor",
            "Ravenclaw",
            "Hufflepuff",
            "Slytherin",
            4
        )
        questionList.add(question30)

        val question31 = Question(
            31,
            "What is Severus Snape's signature spell?",
            "Sectumsempra",
            "Crucio",
            "Imperius",
            "Obliviate",
            1
        )
        questionList.add(question31)

        val question32 = Question(
            32,
            "What is the name of Hagrid’s dog?",
            "Crookshanks",
            "Fang",
            "Norbert",
            "Hermes",
            2
        )
        questionList.add(question32)

        val question33 = Question(
            33,
            "What is the profession of Colin Creevey's father",
            "Woodworker",
            "Milkman",
            "Decorator",
            "Baker",
            2
        )
        questionList.add(question33)

        val question34 = Question(
            34,
            "What's the name of Wealsey's family owl?",
            "Pigwidgeon",
            "Hedwig",
            "Errol",
            "Hermes",
            3
        )
        questionList.add(question34)

        val question35 = Question(
            35,
            "What's the name of Uncle Vernon's sister?",
            "Marjorie",
            "Merope",
            "Minerva",
            "Petunia",
            1
        )
        questionList.add(question35)

        val question36 = Question(
            36,
            "What is the name of Albus Dumbledore’s brother?",
            "Aberforth",
            "Marvolo",
            "Severus",
            "Regulus",
            1
        )
        questionList.add(question36)

        val question37 = Question(
            37,
            "What is the name of a disreputable inn and pub in Hogsmeade?",
            "Hog's Head Inn",
            "The Leaky Cauldron",
            "Borgin and Burkes",
            "Three Broomsticks Inn",
            1
        )
        questionList.add(question37)

        val question38 = Question(
            38,
            "How did Harry and Ron get to Hogwarts their second year?",
            "Apparition",
            "Thestrals",
            "Broomsticks",
            "Mr Weasley's flying car",
            4
        )
        questionList.add(question38)

        val question39 = Question(
            39,
            "What is the name of a popular pub in Hogsmeade often frequented by Hogwarts students?",
            "The Leaky Cauldron",
            "Hog's Head Inn",
            "Three Broomsticks Inn",
            "Ollivander's Shop",
            3
        )
        questionList.add(question39)

        val question40 = Question(
            40,
            "What was the name of the shop where Harry got his first wand?",
            "Borgin and Burkes",
            "Madam Malkin's",
            "Ollivander's Shop",
            "The Leaky Cauldron",
            3
        )
        questionList.add(question40)

        val question41 = Question(
            41,
            "Where did Tom Riddle get the job after leaving Hoqwarts?",
            "Ministry of Magic",
            "Borgin and Burkes",
            "The Leaky Cauldron",
            "Hog's Head Inn",
            2
        )
        questionList.add(question41)

        val question42 = Question(
            42,
            "What dark wizard did Albus Dumbledore defeat in 1945?",
            "Voldemort",
            "Lucius Malfoy",
            "Fenrir Greyback",
            "Gellert Grindelwald",
            4
        )
        questionList.add(question42)

        val question43 = Question(
            43,
            "Who guards the entrance to the Gryffindor common room?",
            "Nearly Headless Nick",
            "The Fat Friar",
            "The Fat Lady",
            "The Bloody Baron",
            3
        )
        questionList.add(question43)

        val question44 = Question(
            44,
            "Which of these is NOT one of the Unforgivable Curses?",
            "Sectumsempra",
            "Avada Kedavra",
            "Imperius",
            "Cruciatus",
            1
        )
        questionList.add(question44)

        val question45 = Question(
            45,
            "What's the nickname of Ravenclaw's ghost?",
            "The Bloody Baron",
            "The Fat Friar",
            "Nearly Headless Nick",
            "The Grey Lady",
            4
        )
        questionList.add(question45)

        val question46 = Question(
            46,
            "Which of these is NOT one of the Hogwarts ghosts?",
            "The Fat Friar",
            "Nearly Headless Nick",
            "The Bloody Baron",
            "Peeves",
            4
        )
        questionList.add(question46)

        val question47 = Question(
            47,
            "What's the nickname of Gryffindor's ghost?",
            "The Fat Lady",
            "The Fat Friar",
            "Nearly Headless Nick",
            "The Bloody Baron",
            3
        )
        questionList.add(question47)

        val question48 = Question(
            48,
            "Who is NOT a member of the Order of the Phoenix?",
            "Cornelius Fudge",
            "Mad-eye Moody",
            "Arthur Weasley",
            "Remus Lupin",
            1
        )
        questionList.add(question48)

        val question49 = Question(
            49,
            "What's the nickname of Hufflepuff's ghost?",
            "The Grey Lady",
            "The Fat Friar",
            "Nearly Headless Nick",
            "The Bloody Baron",
            2
        )
        questionList.add(question49)

        val question50 = Question(
            50,
            "Who is NOT a member of the Dumbledore's Army?",
            "Ron Weasley",
            "Gregory Goyle",
            "Cho Chang",
            "Ginny Weasley",
            2
        )
        questionList.add(question50)

        val question51 = Question(
            51,
            "What's the name of Harry Potter’s girlfriend in his fifth year?",
            "Cho Chang",
            "Ginny Weasley",
            "Padma Patil",
            "Lavender Brown",
            1
        )
        questionList.add(question51)

        val question52 = Question(
            52,
            "What does the spell Obliviate do?",
            "Kills someone",
            "Removes parts of someone’s memory",
            "Makes objects invisible",
            "Destroys objects",
            2
        )
        questionList.add(question52)

        val question53 = Question(
            53,
            "Where does Hermione brew her first Polyjuice Potion?",
            "The Room of Requirement",
            "The Gryffindor common room",
            "Moaning Myrtle’s bathroom",
            "The Hogwarts kitchen",
            3
        )
        questionList.add(question53)

        val question54 = Question(
            54,
            "Who took Pansy Parkinson to the Yule Ball?",
            "Zacharias Smith",
            "Vincent Crabbe",
            "Draco Malfoy",
            "Gregory Goyle",
            3
        )
        questionList.add(question54)

        val question55 = Question(
            55,
            "What was the name of the girl who offended Moaning Myrtle when she was alive?",
            "Olive Hornby",
            "Merope Gaunt",
            "Millicent Bulstrode",
            "Pansy Parkinson",
            1
        )
        questionList.add(question55)

        val question56 = Question(
            56,
            "What's the name of Percy Weasleys's girlfriend?",
            "Angelina Johnson",
            "Cho Chang",
            "Penelope Clearwater",
            "Pansy Parkinson",
            3
        )
        questionList.add(question56)

        val question57 = Question(
            57,
            "What's the name of Hepzibah Smith's house elf?",
            "Hokey",
            "Dobby",
            "Kreacher",
            "Winky",
            1
        )
        questionList.add(question57)

        val question58 = Question(
            58,
            "Where did Harry and Ron eventually find the missing flying Ford Anglia?",
            "Ministry of Magic",
            "The Burrow",
            "The Room of Requirement",
            "The Forbidden Forest",
            4
        )
        questionList.add(question58)

        val question59 = Question(
            59,
            "What's the name of Crouch family's house elf?",
            "Winky",
            "Dobby",
            "Hokey",
            "Kreacher",
            1
        )
        questionList.add(question59)

        val question60 = Question(
            60,
            "Which professor teaches Qudditch lessons?",
            "Professor Grubbly-Plank",
            "Madam Hooch",
            "Professor McGonagall",
            "Professor Snape",
            2
        )
        questionList.add(question60)

        val question61 = Question(
            61,
            "Which professor teaches History of Magic?",
            "Professor Trelawney",
            "Professor Binns",
            "Professor McGonagall",
            "Professor Grubbly-Plank",
            2
        )
        questionList.add(question61)

        val question62 = Question(
            62,
            "What is the peculiarity of the professor Binns?",
            "He is a ghost",
            "He is a half-giant wizard",
            "He is a squib",
            "He is a poltergeist",
            1
        )
        questionList.add(question62)

        val question63 = Question(
            63,
            "Who is Peeves?",
            "A ghost",
            "A squib",
            "A poltergeist",
            "A half-giant wizard",
            3
        )
        questionList.add(question63)

        val question64 = Question(
            64,
            "Which of these is NOT one of the Deathly Hallows?",
            "Invisibility Cloak",
            "Resurrection Stone",
            "Elder Wand",
            "Philosopher's Stone",
            4
        )
        questionList.add(question64)

        val question65 = Question(
            65,
            "Which of these is NOT one of Peverell brothers?",
            "Regulus",
            "Antioch",
            "Cadmus",
            "Ignotus",
            1
        )
        questionList.add(question65)

        val question66 = Question(
            66,
            "What does the spell Reducto do?",
            "Kills someone",
            "Removes parts of someone’s memory",
            "Makes objects invisible",
            "Destroys objects",
            4
        )
        questionList.add(question66)

        val question67 = Question(
            67,
            "What is the peculiarity of the professor Flitwick?",
            "He is a ghost",
            "He is a half-giant wizard",
            "He is a squib",
            "He is a very small man",
            4
        )
        questionList.add(question67)

        val question68 = Question(
            68,
            "What does the spell Relashio do?",
            "Releases the grip on whatever it was holding",
            "Removes parts of someone’s memory",
            "Makes objects invisible",
            "Destroys objects",
            1
        )
        questionList.add(question68)

        val question69 = Question(
            69,
            "What's the nickname of James Potter?",
            "Moony",
            "Prongs",
            "Padfoot",
            "Wormtail",
            2
        )
        questionList.add(question69)

        val question70 = Question(
            70,
            "Which of these is NOT one of the horcruxes?",
            "Helga Hufflepuff's Cup",
            "Marvolo Gaunt's Ring",
            "Godric Gryffindor's sword",
            "Tom Riddle's diary",
            3
        )
        questionList.add(question70)

        val question71 = Question(
            71,
            "What is Ron Weasley's favorite Quidditch team?",
            "Holyhead Harpies",
            "Tutshill Tornados",
            "Puddlemere United",
            "Chudley Cannons",
            4
        )
        questionList.add(question71)

        val question72 = Question(
            72,
            "What's the nickname of Sirius Black?",
            "Moony",
            "Prongs",
            "Padfoot",
            "Wormtail",
            3
        )
        questionList.add(question72)

        val question73 = Question(
            73,
            "What is Dean Thomas' favorite football club?",
            "Manchester United",
            "Tottenham Hotspur",
            "West Ham",
            "Chelsea",
            3
        )
        questionList.add(question73)

        val question74 = Question(
            74,
            "What's the school nickname of Severus Snape?",
            "Moony",
            "Prongs",
            "Snivellus",
            "Wormtail",
            3
        )
        questionList.add(question74)

        val question75 = Question(
            75,
            "Who is the Half-blood Prince?",
            "Harry Potter",
            "Severus Snape",
            "Lord Voldemort",
            "Draco Malfoy",
            2
        )
        questionList.add(question75)

        val question76 = Question(
            76,
            "What Hogwarts house was Penelope Clearwater in?",
            "Gryffindor",
            "Ravenclaw",
            "Hufflepuff",
            "Slytherin",
            2
        )
        questionList.add(question76)

        val question77 = Question(
            77,
            "Who has given Harry Potter the Marauder’s map?",
            "Fred and George",
            "Albus Dumbledore",
            "Hermione Granger",
            "Sirius Black",
            1
        )
        questionList.add(question77)

        val question78 = Question(
            78,
            "What wood is Harry Potter's first wand made of?",
            "Ash",
            "Rosewood",
            "Holly",
            "Hornbeam",
            3
        )
        questionList.add(question78)

        val question79 = Question(
            79,
            "Who has given Harry Potter the Invisibility cloak?",
            "Severus Snape",
            "Albus Dumbledore",
            "Remus Lupin",
            "Fred and George",
            2
        )
        questionList.add(question79)

        val question80 = Question(
            80,
            "What wood is Fleur Delacour's wand made of?",
            "Ash",
            "Rosewood",
            "Holly",
            "Hornbeam",
            2
        )
        questionList.add(question80)

        val question81 = Question(
            81,
            "Where is Borgin and Burkes located?",
            "Diagon Alley",
            "Godric's Hollow",
            "Knockturn Alley",
            "Hogsmeade",
            3
        )
        questionList.add(question81)

        val question82 = Question(
            82,
            "What's the core of Viktor Krum's wand?",
            "A phoenix feather",
            "A Unicorn hair",
            "A dragon heartstring",
            "A Veela hair",
            3
        )
        questionList.add(question82)

        val question83 = Question(
            83,
            "What wood is Viktor Krum's wand made of?",
            "Ash",
            "Rosewood",
            "Holly",
            "Hornbeam",
            4
        )
        questionList.add(question83)

        val question84 = Question(
            84,
            "What's the core of Fleur Delacour's wand?",
            "A phoenix feather",
            "A unicorn hair",
            "A dragon heartstring",
            "A Veela hair",
            4
        )
        questionList.add(question84)

        val question85 = Question(
            85,
            "Where is Madam Puddifoot's Tea Shop located?",
            "Diagon Alley",
            "Godric's Hollow",
            "Knockturn Alley",
            "Hogsmeade",
            4
        )
        questionList.add(question85)

        val question86 = Question(
            86,
            "What's the core of Harry Potter's first wand?",
            "A phoenix feather",
            "A unicorn hair",
            "A dragon heartstring",
            "A Veela hair",
            1
        )
        questionList.add(question86)

        val question87 = Question(
            87,
            "Who is the head of Hufflepuff House?",
            "Professor Sprout",
            "Professor Snape",
            "Professor Flitwick",
            "Professor McGonagall",
            1
        )
        questionList.add(question87)

        val question88 = Question(
            88,
            "What's the core of Cedric Diggory's wand?",
            "A phoenix feather",
            "A unicorn hair",
            "A dragon heartstring",
            "A Veela hair",
            2
        )
        questionList.add(question88)

        val question89 = Question(
            89,
            "Who is the head of Slytherin House?",
            "Professor Sprout",
            "Professor Snape",
            "Professor Flitwick",
            "Professor McGonagall",
            2
        )
        questionList.add(question89)

        val question90 = Question(
            90,
            "Which of these is NOT one of the founders of Hogwarts?",
            "Rowena Ravenclaw",
            "Salazar Slytherin",
            "Godric Gryffindor",
            "Albus Dumbledore",
            4
        )
        questionList.add(question90)

        val question91 = Question(
            91,
            "Who is the head of Ravenclaw House?",
            "Professor Sprout",
            "Professor Snape",
            "Professor Flitwick",
            "Professor McGonagall",
            3
        )
        questionList.add(question91)

        val question92 = Question(
            92,
            "Who is the founder of the S.P.E.W.?",
            "Harry Potter",
            "Hermione Granger",
            "Ron Weasley",
            "Ginny Weasley",
            2
        )
        questionList.add(question92)

        val question93 = Question(
            93,
            "Who is the head of Gryffindor House?",
            "Professor Sprout",
            "Professor Snape",
            "Professor Snape",
            "Professor McGonagall",
            4
        )
        questionList.add(question93)

        val question94 = Question(
            94,
            "Who is the founder of the Slug Club?",
            "Harry Potter",
            "Professor Slughorn",
            "Professor Snape",
            "Professor Sprout",
            2
        )
        questionList.add(question94)

        val question95 = Question(
            95,
            "What's the name of Hagrid’s pet hippogriff?",
            "Hermes",
            "Fang",
            "Crookshanks",
            "Buckbeak",
            4
        )
        questionList.add(question95)

        val question96 = Question(
            96,
            "Which of these is NOT a member of the Inquisitorial Squad?",
            "Colin Creevey",
            "Vincent Crabbe",
            "Draco Malfoy",
            "Pansy Parkinson",
            1
        )
        questionList.add(question96)

        val question97 = Question(
            97,
            "What's the name of Draco Malfoy's son??",
            "Vincent",
            "Scorpius",
            "Abraxas",
            "Zacharias",
            2
        )
        questionList.add(question97)

        val question98 = Question(
            98,
            "What Hogwarts house was Padma Patil in?",
            "Gryffindor",
            "Hufflepuff",
            "Ravenclaw",
            "Slytherin",
            3
        )
        questionList.add(question98)

        val question99 = Question(
            99,
            "What's the name of Draco Malfoy's grandfather?",
            "Roger",
            "Vincent",
            "Abraxas",
            "Zacharias",
            3
        )
        questionList.add(question99)

        val question100 = Question(
            100,
            "Who betrayed Lily and James Potter?",
            "Peter Pettigrew",
            "Sirius Black",
            "Severus Snape",
            "Lucius Malfoy",
            1
        )
        questionList.add(question100)


        return questionList


    }
}