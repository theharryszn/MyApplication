package com.muiz.myapplication.data

import java.io.Serializable


data class News(val heading: String, val content: String): Serializable {
    companion object {
        val defaultNews = arrayListOf(
            News("Liverpool crash back to reality, Dortmund hand Bayern the advantage, De Gea saves Man Utd: Weekend Review", "Liverpool's inconsistency is threatening to deny Jurgen Klopp's team a top-four finish in the Premier League. Or, to be more precise, their consistency in dropping points against struggling opponents is the reason they are now six points adrift of fourth spot.\n" +
                    "\n" +
                    "Saturday's 1-0 defeat at Bournemouth -- just six days after their 7-0 rout of Manchester United -- was the second time this season that Liverpool have lost to a team that started the day at the bottom of the table. You could even argue that it was the third instance, with United starting Matchday 3 as the bottom team, before moving up a spot on goal difference because of other results before kick-off, when beating Liverpool 2-1 at Old Trafford in August.\n" +
                    "\n" +
                    "- Liverpool ratings: Salah 3/10 after missed penalty\n" +
                    "\n" +
                    "Still, even if that early defeat against United is discounted, Liverpool have now dropped 15 points in games against teams threatened with relegation this season. They have failed to beat Crystal Palace in two fixtures, lost at home to Leeds United and were beaten at Nottingham Forest, Wolves and now Bournemouth -- a team they hammered 9-0 at Anfield earlier this season.\n" +
                    "\n" +
                    "Had Liverpool taken just half of the 15 points they have dropped against the strugglers, they would now be in the top four, with a game in hand over fourth-placed Tottenham Hotspur."),
            News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\"")
       , News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\"")
            , News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""), News("Manchester United's Erik ten Hag questions inconsistent VAR after Casemiro red", "Erik ten Hag slammed the use of VAR in the Premier League as \"inconsistent\" after Casemiro was sent off for a second time in his Manchester United career.\n" +
                    "\n" +
                    "The midfielder was shown a red card for a high challenge on Carlos Alcaraz during the 0-0 draw with Southampton on Sunday after referee Anthony Taylor was advised to consult the pitchside monitor by VAR Andre Marriner.\n" +
                    "\n" +
                    "- Dawson: Southampton put brakes on Man United's momentum\n" +
                    "\n" +
                    "Ten Hag was incensed by the decision, particularly after Leicester City defender Ricardo Pereira escaped punishment for a similar challenge on Chelsea's Joao Felix on Saturday.\n" +
                    "\n" +
                    "Ten Hag also thought United should have had a penalty when Armel Bella-Kotchap appeared to handle Marcus Rashford's cross in the penalty area.\n" +
                    "\n" +
                    "\"What I think is the inconsistency, players don't know anymore what is the policy,\" Ten Hag said. \"I think, all across, you see this weekend Leicester versus Chelsea, VAR is not coming on the line [the pitchside monitor].\n" +
                    "\n" +
                    "\"Today, it is coming on the line, and today two penalty situations, they don't come on the line. I think especially the first, it is clear and obvious handball. So, what is the policy?\""))
    }
}

