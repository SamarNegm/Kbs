(deftemplate Symptoms
(slot xx)
(slot x)
(slot xx)
(slot x)
(slot One_sided_pain)
(slot Restlessness)
(slot  Excessive_tearing)
(slot Redness_of_your_eye_on_the_affected_side)
(slot Affect_one_side_or_both_sides_of_your_head)
(slot Stuffy)
(slot runny_nose)
(slot Forehead_or_facial_sweating)
(slot Pale_skin_flushing_on_your_face)
(slot Swelling_around_your_eye)
(slot Drooping_eyelid)
(slot Then_Chronic_daily_headaches)
(slot Constipation)
(slot Mood_changes_from_depression_to_euphoria )
(slot Food_cravings)
(slot Neck_stiffness)
(slot Increased_thirst_and_urination)
(slot Frequent_yawning)
(slot Visual_phenomena)
(slot Vision_loss)
(slot Pins_and_needles_sensations_in_an_arm_or_leg)
(slot  Weakness_or_numbness )
(slot  Difficulty_speaking )
(slot Hearing_noises_or_music)
(slot jerking ) 

(slot Pain_usually_on_one_side_of_your_head )
(slot Pain_that_throbs_or_pulses)
(slot Sensitivity_to_light_sound_and_sometimes_smell_and_touch )
(slot Nausea_and_vomiting)
(slot Blind_spots)
(slot Zigzag_lines)
(slot Shimmering_spots)
(slot Changes_in_vision)
(slot Flashes_of_light)
(slot Numbness)
(slot Speech_or_language_difficulty )
(slot  Muscle_weakness)
(slot Have_a_pulsating_throbbing_sensation)
(slot Dull_ching_head_pain)
(slot Sensation_of_tightness)
(slot pressure_across_your_forehead)
(slot on_the_sides_and_back_of_your_head)
(slot Tenderness_on_your_scalp_neck_and_shoulder_muscles)
(slot Cause_moderate_to_severe_pain)
(slot history_of_episodic_migraines)
(slot Nausea_vomiting_or_both)
(slot Sensitivity_to_light_and_sound)
(slot come_on_suddenly)
(slot Cause_pain_that_feels_like_pressing)
(slot daily )
(slot continuous )
(slot no_pain_free_periods)
(slot moderate_pain)
(slot affect_both_sides_of_your_head)
(slot Respond_to_the_prescription_pain_reliever_indomethacin)
(slot Sensation_of_restlessness)
(slot Drooping_eyelid_or_pupil_narrowing)
(slot Nasal_congestion_or_runny_nose)
(slot Tearing_or_redness_of_the_eye)
(slot spikes_of_severe_pain) 
(slot 30_to_90_minutes)
(slot 4_hours_to_3_days)
(slot less_than_an_hour)
(slot 30_min_to_week)
(slot 3_months_without_shifting_sides_or_pain_free_periods)
)








(deftemplate Type
(slot type)
)
(deftemplate Acute_treatments
(slot Oxygen)
(slot Triptans)
(slot Octreotide)
(slot Local_anesthetics)
(slot Dihydroergotamine)
)
(deftemplate Preventive_treatments
(slot Calcium_channel_blockers)
(slot Corticosteroids)
(slot Lithium_carbonate)
(slot Nerve_block)
(slot anti_seizure)
)

(defrule rule1
(Symptoms { Stuffy == true})

=> (assert(Type(type “Cluster_headache”))))
(defrule rule2
(Symptoms { One_sided_pain == true})

=> (assert(Type(type “Cluster_headache”))))
(defrule rule3
(Symptoms { Restlessness == true})

=> (assert(Type(type “Cluster_headache”))))
(defrule rule4
(Symptoms {Excessive_tearing == true})

=> (assert(Type(type “Cluster_headache”))))
(defrule rule5
(Symptoms {Swelling_around_your_eye == true})

=> (assert(Type(type “Cluster_headache”))))

(defrule rule6
(Symptoms {Forehead_or_facial_sweating == true})

=> (assert(Type(type “Cluster_headache”))))

(defrule rule7
(Symptoms {runny_nose == true})

=> (assert(Type(type “Cluster_headache”))))

(defrule rule8
(Symptoms {Redness_of_your_eye_on_the_affected_side ==true})

=> (assert(Type(type “Cluster_headache”))))

(defrule rule9
(Symptoms {Constipation == true})

=> (assert(Type(type “Migraine”))))

(defrule rule10
(Symptoms {Mood_changes_from_depression_to_euphoria == yes})

=> (assert(Type(type “Migraine”))))
(defrule rule10
(Symptoms {Food_cravings == true})

=> (assert(Type(type “Migraine”))))
(defrule rule11
(Symptoms {Neck_stiffness == true})

=> (assert(Type(type “Migraine”))))

(defrule rule12
(Symptoms {Increased_thirst_and_urination == true})

=> (assert(Type(type “Migraine”))))

(defrule rule13
(Symptoms {Frequent_yawning == true})

=> (assert(Type(type “Migraine”))))

(defrule rule14
(Symptoms {Visual_phenomena == true})

=> (assert(Type(type “Migraine”))))


(defrule rule15
(Symptoms {Vision_loss == true})

=> (assert(Type(type “Migraine”))))


(defrule rule15
(Symptoms {Pins_and_needles_sensations_in_an_arm_or_leg == true})

=> (assert(Type(type “Migraine”))))



(defrule rule16
(Symptoms {Difficulty_speaking == true})

=> (assert(Type(type “Migraine”))))


(defrule rule17
(Symptoms {Hearing_noises_or_music  == true})

=> (assert(Type(type “Migraine”))))

(defrule rule18
(Symptoms {jerking   == true})

=> (assert(Type(type “Migraine”))))



(defrule rule19
(Symptoms {Pain_usually_on_one_side_of_your_head == true})

=> (assert(Type(type “Migraine”))))

(defrule rule20
(Symptoms {Pain_that_throbs_or_pulses   == true})

=> (assert(Type(type “Migraine”))))

(defrule rule21
(Symptoms {Sensitivity_to_light_sound_and_sometimes_smell_and_touch == true})

=> (assert(Type(type “Migraine”))))

(defrule rule22
(Symptoms {Nausea_and_vomiting == true})

=> (assert(Type(type “Migraine”))))



;;;;;;;;;;;;;;;
(defrule rule23
(Symptoms {Blind_spots == true})

=> (assert(Type(type “Migraine_with_aura”))))
(defrule rule24
(Symptoms {Zigzag_lines == true})

=> (assert(Type(type “Migraine_with_aura”))))

(defrule rule25
(Symptoms {Shimmering_spots == true})

=> (assert(Type(type “Migraine_with_aura”))))
(defrule rule25
(Symptoms {Changes_in_vision == true})

=> (assert(Type(type “Migraine_with_aura”))))
(defrule rule26
(Symptoms {Numbness == true})

=> (assert(Type(type “Migraine_with_aura”))))
  
(defrule rule27
(Symptoms {Speech_or_language_difficulty == true})

=> (assert(Type(type “Migraine_with_aura”))))

(defrule rule28
(Symptoms {Muscle_weakness == true})

=> (assert(Type(type “Migraine_with_aura”))))

(defrule rule29
(Symptoms {Dull_ching_head_pain == true})

=> (assert(Type(type “Tension_headache”))))

(defrule rule30
(Symptoms {Sensation_of_tightness == true})

=> (assert(Type(type “Tension_headache”))))
(defrule rule31
(Symptoms {pressure_across_your_forehead == true})

=> (assert(Type(type “Tension_headache”))))

(defrule rule32
(Symptoms {Tenderness_on_your_scalp_neck_and_shoulder_muscles == true})

=> (assert(Type(type “Tension_headache”))))

;;;;;;;;;;;;;;;;;;;;;;
(defrule rule32
(Symptoms {Tenderness_on_your_scalp_neck_and_shoulder_muscles == true})

=> (assert(Type(type “Tension_headache”))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defrule rule33
(Symptoms {history_of_episodic_migraines == true})
(Symptoms {Cause_moderate_to_severe_pain == true})
=> (assert(Type(type “Then_Chronic_daily_headaches”)))(printout t  " you might have have Tension headache" crlf))

(defrule rule34
(Symptoms {Affect_one_side_or_both_sides_of_your_head == true})

=> (assert(Type(type “Then_Chronic_daily_headaches”))))
(defrule rule35
(Symptoms {Have_a_pulsating_throbbing_sensation == true})

=> (assert(Type(type “Then_Chronic_daily_headaches”)))(printout t  " you might have have Tension headache" crlf))
(defrule rule36
(Symptoms {Nausea_vomiting_or_both == true})

=> (assert(Type(type “Then_Chronic_daily_headaches”)))(printout t  " you might have have Tension headache" crlf))
(defrule rule37
(Symptoms {Sensitivity_to_light_and_sound == true})

=> (assert(Type(type “Then_Chronic_daily_headaches”)))(printout t  " you might have have Tension headache" crlf))
(defrule rule38
(Symptoms {come_on_suddenly == true})
(Symptoms {affect_both_sides_of_your_head == true})
(Symptoms {Cause_pain_that_feels_like_pressing  == true})
=> (assert(Type(type “New_daily_persistent_headache”)))(printout t  " you might have have New daily persistent headache" crlf))
(defrule rule39
(Symptoms {Pain_usually_on_one_side_of_your_head == true})
(Symptoms {daily == true})
(Symptoms {continuous == true})
(Symptoms {no_pain_free_periods == true})
=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule40
(Symptoms {moderate_pain == true})
(Symptoms {spikes_of_severe_pain == true})
(Symptoms {continuous == true})
(Symptoms {Respond_to_the_prescription_pain_reliever_indomethacin == true})
=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule41
(Symptoms {moderate_pain == true})
(Symptoms {spikes_of_severe_pain == true})
(Symptoms {continuous == true})
(Symptoms {Respond_to_the_prescription_pain_reliever_indomethacin == true}
)
=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule42
(Symptoms {spikes_of_severe_pain == true})

=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule43
(Symptoms {Tearing_or_redness_of_the_eye == true})

=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule44
(Symptoms {Nasal_congestion_or_runny_nose == true})

=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule45
(Symptoms {Drooping_eyelid_or_pupil_narrowing == true})
=> (assert(Type(type “Hemicrania_continua”))))
(defrule rule46
(Type {type == “Cluster_headache”})
=> (printout t2  " Oxygen." crlf)(printout t  " you might have have Cluster headache." crlf))

(defrule rule47
(Type {type == “Cluster_headache”})
=> (printout t2  " Triptans. " crlf))


(defrule rule48
(Type {type == “Cluster_headache”})
=> (printout t2  " Octreotide. " crlf))

(defrule rule49
(Type {type == “Cluster_headache”})
=> (printout t2  " Local anesthetics. " crlf))
(defrule rule50
(Type {type == “Cluster_headache”})
=> (printout t2  " Dihydroergotamine. " crlf))
(defrule rule51
(Type {type == “Migraine”})
=> (printout t2  " Pain-relieving medications \n" crlf)(printout t  " you might have Migraine" crlf))
(defrule rule52
(Type {type == “Migraine”})
=> (printout t2  " Preventive medications " crlf))
(defrule rule53
(Type {type == “Migraine”})
=> (printout t2  " Botox injections " crlf))

(defrule rule54
(Type {type == “Migraine_with_aura”})
=> (printout t2  " Dihydroergotamines (D.H.E.45, Migranal) " crlf)(printout t  " you might have have Migraine with aura" crlf))
(defrule rule55
(Type {type == “Migraine_with_aura”})
=> (printout t2  " Blood pressure lowering medications " crlf))
(defrule rule56
(Type {type == “Tension_headache”})
=> (printout t2  " Stress management classes " crlf))
(defrule rule57
(Type {type == “Tension_headache”})
=> (printout t2  " Biofeedback " crlf))
(defrule rule58
(Type {type == “Tension_headache”})
=> (printout t2  " Cognitive behavioral therapy (CBT) " crlf))

(defrule rule59
(Type {type == “Tension_headache”})
=> (printout t2  "Acupuncture " crlf))

(defrule rule60
(Type {type == “Tension_headache”})
=> (printout t2  "prescription-strength acetaminophen " crlf)(printout t  " you might have have Tension headache" crlf))


(defrule rule61
(Type {type == “Hemicrania_continua”})
=> (printout t2  "Some anti-inflammatory medications ease hemicrania continua headaches " crlf)(printout t  " you might have have Hemicrania continua" crlf))

(defrule rule62
(Type {type == “Then_Chronic_daily_headaches”})
=> (printout t2  "Antidepressants " crlf "Beta blockers. " crlf "Anti-seizure medications." crlf "NSAIDs." crlf "Botulinum toxin")(printout t  " you might have have The Chronic daily headaches" crlf))

(defrule rule63
(Symptoms {30_to_90_minutes == true})

=> (assert(Type(type “Cluster_headache”))))
(defrule rule64
(Symptoms {4_hours_to_3_days == true})

=> (assert(Type(type “Migraine”))))
(defrule rule65
(Symptoms {less_than_an_hour == true})
=> (assert(Type(type “Migraine_with_aura”))))

(defrule rule66
(Symptoms {30_min_to_week == true})
=> (assert(Type(type “Tension_headache”))))


(defrule rule67
(Symptoms {3_months_without_shifting_sides_or_pain_free_periods == true})
=> (assert(Type(type “Hemicrania_continua”))))


