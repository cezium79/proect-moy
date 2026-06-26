package com.example.ohrana

Серийный номер тома: 0931-160B
H:.
|   .gitignore
|   build.gradle.kts
|   gradle.properties
|   gradlew
|   gradlew.bat
|   local.properties
|   settings.gradle.kts
|   README.md
|   structure.txt
|
+---.kotlin
|   +---errors
|   |       errors-1782190647899.log
|   |
|   \---sessions
+---app
|   |   .gitignore
|   |   build.gradle.kts
|   |
|   +---src
|   |   +---androidTest
|   |   |   \---java
|   |   |       \---com
|   |   |           \---example
|   |   |               \---ohrana
|   |   |                       ExampleInstrumentedTest.kt
|   |   |
|   |   +---main
|   |   |   |   AndroidManifest.xml
|   |   |   |
|   |   |   +---java
|   |   |   |   \---com
|   |   |   |       \---example
|   |   |   |           \---ohrana
|   |   |   |               |   AdministratorScreen.kt
|   |   |   |               |   Employee.kt
|   |   |   |               |   EmployeeListScreen.kt
|   |   |   |               |   MainActivity.kt
|   |   |   |               |   OhrannikCabinetScreen.kt
|   |   |   |               |   OhrannikScreen.kt
|   |   |   |               |   PrivetScreen.kt
|   |   |   |               |   QrHandler.kt
|   |   |   |               |   SharedPrefsManager.kt
|   |   |   |               |   SpisokOtchetov.kt
|   |   |   |               |   Marshruti.kt
|   |   |   |               |   OhrannikShiftControl.kt
|   |   |   |               |   AlarmModel.kt
|   |   |   |               |   AlarmScheduler.kt
|   |   |   |               |   AlarmReceiver.kt
|   |   |   |               |   AlarmService.kt
|   |   |   |               |
|   |   |   |               +---res
|   |   |   |               |   \---xml
|   |   |   |               \---ui
|   |   |   |                   \---theme
|   |   |   |                           Color.kt
|   |   |   |                           Theme.kt
|   |   |   |                           Type.kt
|   |   |   |
|   |   |   +---keepRules
|   |   |   |       rules.keep
|   |   |   |
|   |   |   \---res
|   |   |       +---drawable
|   |   |       |       ic_launcher_background.xml
|   |   |       |       ic_launcher_foreground.xml
|   |   |       |
|   |   |       +---mipmap-anydpi-v26
|   |   |       |       ic_launcher.xml
|   |   |       |       ic_launcher_round.xml
|   |   |       |
|   |   |       +---mipmap-hdpi
|   |   |       |       ic_launcher.webp
|   |   |       |       ic_launcher_round.webp
|   |   |       |
|   |   |       +---mipmap-mdpi
|   |   |       |       ic_launcher.webp
|   |   |       |       ic_launcher_round.webp
|   |   |       |
|   |   |       +---mipmap-xhdpi
|   |   |       |       ic_launcher.webp
|   |   |       |       ic_launcher_round.webp
|   |   |       |
|   |   |       +---mipmap-xxhdpi
|   |   |       |       ic_launcher.webp
|   |   |       |       ic_launcher_round.webp
|   |   |       |
|   |   |       +---mipmap-xxxhdpi
|   |   |       |       ic_launcher.webp
|   |   |       |       ic_launcher_round.webp
|   |   |       |
|   |   |       +---values
|   |   |       |       colors.xml
|   |   |       |       strings.xml
|   |   |       |       themes.xml
|   |   |       |
|   |   |       \---xml
|   |   |               backup_rules.xml
|   |   |               data_extraction_rules.xml
|   |   |               file_paths.xml
|   |   |
|   |   \---test
|   |       \---java
|   |           \---com
|   |               \---example
|   |                   \---ohrana
|   |                           ExampleUnitTest.kt
|   |
|   \---build
|       +---intermediates
|       |   +---nested_resources_validation_report
|       |   |   \---debug
|       |   |       \---generateDebugResources
|       |   |               nestedResourcesValidationReport.txt
|       |   |
|       |   +---annotation_processor_list
|       |   |   \---debug
|       |   |       \---javaPreCompileDebug
|       |   |               annotationProcessors.json
|       |   |
|       |   +---assets
|       |   |   \---debug
|       |   |       \---mergeDebugAssets
|       |   |           \---mlkit_barcode_models
|       |   |                   oned_feature_extractor_mobile.tflite
|       |   |                   barcode_ssd_mobilenet_v1_dmp25_quant.tflite
|       |   |                   oned_auto_regressor_mobile.tflite
|       |   |
|       |   +---incremental
|       |   |   +---debug
|       |   |   |   +---packageDebugResources
|       |   |   |   |   |   compile-file-map.properties
|       |   |   |   |   |   merger.xml
|       |   |   |   |   |
|       |   |   |   |   +---merged.dir
|       |   |   |   |   |   \---values
|       |   |   |   |   |           values.xml
|       |   |   |   |   |
|       |   |   |   |   \---stripped.dir
|       |   |   |   \---mergeDebugResources
|       |   |   |       |   compile-file-map.properties
|       |   |   |       |   merger.xml
|       |   |   |       |
|       |   |   |       +---merged.dir
|       |   |   |       |   +---values
|       |   |   |       |   |       values.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-hi
|       |   |   |       |   |       values-hi.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-pt
|       |   |   |       |   |       values-pt.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-watch-v21
|       |   |   |       |   |       values-watch-v21.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-watch-v20
|       |   |   |       |   |       values-watch-v20.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-hr
|       |   |   |       |   |       values-hr.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-hu
|       |   |   |       |   |       values-hu.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-hy
|       |   |   |       |   |       values-hy.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v16
|       |   |   |       |   |       values-v16.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v18
|       |   |   |       |   |       values-v18.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v17
|       |   |   |       |   |       values-v17.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ldltr-v21
|       |   |   |       |   |       values-ldltr-v21.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-af
|       |   |   |       |   |       values-af.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-in
|       |   |   |       |   |       values-in.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-zh-rHK
|       |   |   |       |   |       values-zh-rHK.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-is
|       |   |   |       |   |       values-is.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-it
|       |   |   |       |   |       values-it.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-am
|       |   |   |       |   |       values-am.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-iw
|       |   |   |       |   |       values-iw.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-b+sr+Latn
|       |   |   |       |   |       values-b+sr+Latn.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ar
|       |   |   |       |   |       values-ar.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-as
|       |   |   |       |   |       values-as.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v21
|       |   |   |       |   |       values-v21.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-es-rUS
|       |   |   |       |   |       values-es-rUS.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v23
|       |   |   |       |   |       values-v23.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ja
|       |   |   |       |   |       values-ja.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v22
|       |   |   |       |   |       values-v22.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v25
|       |   |   |       |   |       values-v25.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-az
|       |   |   |       |   |       values-az.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v24
|       |   |   |       |   |       values-v24.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-pt-rPT
|       |   |   |       |   |       values-pt-rPT.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-zu
|       |   |   |       |   |       values-zu.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v26
|       |   |   |       |   |       values-v26.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ro
|       |   |   |       |   |       values-ro.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v28
|       |   |   |       |   |       values-v28.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sw600dp-v13
|       |   |   |       |   |       values-sw600dp-v13.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-be
|       |   |   |       |   |       values-be.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ru
|       |   |   |       |   |       values-ru.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-bg
|       |   |   |       |   |       values-bg.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-night-v31
|       |   |   |       |   |       values-night-v31.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-bn
|       |   |   |       |   |       values-bn.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-en-rCA
|       |   |   |       |   |       values-en-rCA.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-bs
|       |   |   |       |   |       values-bs.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v30
|       |   |   |       |   |       values-v30.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-v31
|       |   |   |       |   |       values-v31.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ka
|       |   |   |       |   |       values-ka.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-si
|       |   |   |       |   |       values-si.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sk
|       |   |   |       |   |       values-sk.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sl
|       |   |   |       |   |       values-sl.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sq
|       |   |   |       |   |       values-sq.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ca
|       |   |   |       |   |       values-ca.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sr
|       |   |   |       |   |       values-sr.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-kk
|       |   |   |       |   |       values-kk.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-km
|       |   |   |       |   |       values-km.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-kn
|       |   |   |       |   |       values-kn.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sv
|       |   |   |       |   |       values-sv.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ko
|       |   |   |       |   |       values-ko.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-sw
|       |   |   |       |   |       values-sw.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ta
|       |   |   |       |   |       values-ta.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ky
|       |   |   |       |   |       values-ky.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-pt-rBR
|       |   |   |       |   |       values-pt-rBR.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-cs
|       |   |   |       |   |       values-cs.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-h720dp-v13
|       |   |   |       |   |       values-h720dp-v13.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-te
|       |   |   |       |   |       values-te.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-th
|       |   |   |       |   |       values-th.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-tl
|       |   |   |       |   |       values-tl.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-xlarge-v4
|       |   |   |       |   |       values-xlarge-v4.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-da
|       |   |   |       |   |       values-da.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-tr
|       |   |   |       |   |       values-tr.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-en-rAU
|       |   |   |       |   |       values-en-rAU.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-de
|       |   |   |       |   |       values-de.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-lo
|       |   |   |       |   |       values-lo.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-lt
|       |   |   |       |   |       values-lt.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-lv
|       |   |   |       |   |       values-lv.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-en-rIN
|       |   |   |       |   |       values-en-rIN.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-uk
|       |   |   |       |   |       values-uk.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ur
|       |   |   |       |   |       values-ur.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-mk
|       |   |   |       |   |       values-mk.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ml
|       |   |   |       |   |       values-ml.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-mn
|       |   |   |       |   |       values-mn.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-uz
|       |   |   |       |   |       values-uz.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-fr-rCA
|       |   |   |       |   |       values-fr-rCA.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-mr
|       |   |   |       |   |       values-mr.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ms
|       |   |   |       |   |       values-ms.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-el
|       |   |   |       |   |       values-el.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-zh-rTW
|       |   |   |       |   |       values-zh-rTW.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-my
|       |   |   |       |   |       values-my.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-es
|       |   |   |       |   |       values-es.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-et
|       |   |   |       |   |       values-et.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-eu
|       |   |   |       |   |       values-eu.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-vi
|       |   |   |       |   |       values-vi.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-nb
|       |   |   |       |   |       values-nb.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-port
|       |   |   |       |   |       values-port.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-night-v8
|       |   |   |       |   |       values-night-v8.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-ne
|       |   |   |       |   |       values-ne.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-fa
|       |   |   |       |   |       values-fa.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-nl
|       |   |   |       |   |       values-nl.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-zh-rCN
|       |   |   |       |   |       values-zh-rCN.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-fi
|       |   |   |       |   |       values-fi.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-en-rXC
|       |   |   |       |   |       values-en-rXC.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-fr
|       |   |   |       |   |       values-fr.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-large-v4
|       |   |   |       |   |       values-large-v4.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-hdpi-v4
|       |   |   |       |   |       values-hdpi-v4.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-en-rGB
|       |   |   |       |   |       values-en-rGB.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-land
|       |   |   |       |   |       values-land.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-or
|       |   |   |       |   |       values-or.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-gl
|       |   |   |       |   |       values-gl.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-gu
|       |   |   |       |   |       values-gu.xml
|       |   |   |       |   |
|       |   |   |       |   +---values-pa
|       |   |   |       |   |       values-pa.xml
|       |   |   |       |   |
|       |   |   |       |   \---values-pl
|       |   |   |       |           values-pl.xml
|       |   |   |       |
|       |   |   |       \---stripped.dir
|       |   |   +---mergeDebugAssets
|       |   |   |       merger.xml
|       |   |   |
|       |   |   +---mergeDebugJniLibFolders
|       |   |   |       merger.xml
|       |   |   |
|       |   |   +---debug-mergeJavaRes
|       |   |   |   |   merge-state
|       |   |   |   |
|       |   |   |   \---zip-cache
|       |   |   |           aIKQmSjnv3I7VAZtBk5Zlw==
|       |   |   |           WUe1uupx3j+KdaXtKMt8aQ==
|       |   |   |           wJe6pTB0eGRja7D6N5Dv5A==
|       |   |   |           robTz1jJ8W5LYCXBjZ9Zhg==
|       |   |   |           XdXOz0U8+0LqmaJG_x3AyA==
|       |   |   |           vyt3JL4LpMp6ct+fdA2uVA==
|       |   |   |           BRqBQss89vGDnVCqDo0jQw==
|       |   |   |           Hs_ypy0p7L8gZ7BwJ_DEyA==
|       |   |   |           bHjACXd8ttRC7Xs8LlUtKw==
|       |   |   |           vxLGIG4KHtsOU7XBZ8o_yA==
|       |   |   |           RTTMyXIrkN+jR5XZibzQeA==
|       |   |   |           vV32Ur3D_+9wzdn+JG2wTw==
|       |   |   |           eq2x0FagKx5t7vvTWMeQNg==
|       |   |   |           ZTHw7zvcw0K+aSGb+fP7Lg==
|       |   |   |           fgt24d83MG0ymbTCo4eTrg==
|       |   |   |           xePXTPzqjtOO8+YEQ5Ir2g==
|       |   |   |           Xp5L2dDRAAOkEQhMC8ebqw==
|       |   |   |           kEy+TLJsDj1X9FLqsh76qQ==
|       |   |   |           WmYj06p9JQ8VfopcDZK_DQ==
|       |   |   |           ArS8AB0BetaR7JeZG0yqrw==
|       |   |   |           _5e7nIoBgEf_8qNvnwsiCw==
|       |   |   |           Y0sHJK9LVE4O4rxuVd+s7A==
|       |   |   |           3mbgPCqVuTAoKT+U65EGDA==
|       |   |   |           glRyl1pswlGXchkGNIGxbw==
|       |   |   |           jNAQ0PAxKwcJLvifgfGrzA==
|       |   |   |           23YMIDDIvxoXz6yOYd0U7w==
|       |   |   |           hYql7cDr7fQnEI34XN_12Q==
|       |   |   |           bbY8RLlbtzY5woUAjzs2jA==
|       |   |   |           tqnzCzt5rEe+qBeJwUMMkw==
|       |   |   |           vc0o1emIN4ywUWPdGAAUMw==
|       |   |   |           AUjbeQohdR7qaOB9tHiwuA==
|       |   |   |           nP9kV052OxBpXu_vaehJ2A==
|       |   |   |           ztuOfq38zRDjS+JgREPUbA==
|       |   |   |           qxxVlIpt_rd+KGT70CfH5Q==
|       |   |   |           6sANr8UDx24R66b7SFu7wg==
|       |   |   |           +s415VylVO2Ja_IKfrputA==
|       |   |   |           hbYcw5YkLr2q8UfydFthEw==
|       |   |   |           ODkm8hYAbfkLamX9vC06Og==
|       |   |   |           7OX7nXw4asabrRyctO2VDQ==
|       |   |   |           XETLAuO0tX5siwXQzVk_Hw==
|       |   |   |           PSFFO2ZYia_cO2+iel5sKQ==
|       |   |   |           KQEh3_dt1clf2xMRzrAH7g==
|       |   |   |           KhYOvNyPRF6GhFMeDv4DRg==
|       |   |   |           S6eZ4cxoG93aQmInLLVzZA==
|       |   |   |           c_Cr1n0to_a04ZlUKzFboA==
|       |   |   |           VGdwSqX2wZu7jRdInyM8kg==
|       |   |   |           xgQmUNyIGCeuoPH_LuwAdQ==
|       |   |   |           QMA843IX518AZXSY5pmIwg==
|       |   |   |           etoZ5KpBF1TPQRCDiGD71g==
|       |   |   |           CJP71JeLv+cvgQ_MqX1rWg==
|       |   |   |           PnYOzGFnQ7YfTfVVHQJmAQ==
|       |   |   |           c1L4pcmcWVLKCDBZ0kNIuA==
|       |   |   |           119p_O4WV5IxduSi4kt_0A==
|       |   |   |           rcVQ89rV4AOs3n9P9IG4ZQ==
|       |   |   |           12f3wP4WerC6gqNbWcSTJw==
|       |   |   |           U_xgDb1nH9bdPGOsay70Xg==
|       |   |   |           dsLjGxZha0JVsnq3+_aclA==
|       |   |   |           bsMYRQOveM_QVA4PuHzRog==
|       |   |   |           rvqYHRkQcdP4WfnQcky19A==
|       |   |   |           HPI2AS_G1g859cuQbhdgdg==
|       |   |   |           MP+F8wpFMWRhSw0JKR8Vhw==
|       |   |   |           3wvMNa2tYSOJhBL5UBL7RQ==
|       |   |   |           MO20yL6kej8cz9fhKcYqBg==
|       |   |   |           +qTAMrt3eWRey+ZFBaFspg==
|       |   |   |           o+ihNFE_KtAgTpto6wAZBA==
|       |   |   |           bsA3q4UtDv9gSaY+ymUbBQ==
|       |   |   |           dWFDGkrdaGEJaBwOXrRhcg==
|       |   |   |           3TyP3KE3VSiPiz79zmr1Wg==
|       |   |   |           QnkKturcnYevpqn3BCMWDw==
|       |   |   |           ZereNr0FyLWxx1lGogIErw==
|       |   |   |           6lY+BY8DP2n_Gz4hUx9aTA==
|       |   |   |           9iQxfajD929AxlZlyvGumw==
|       |   |   |           iqP0+UTVkwqQniD_S7wTEA==
|       |   |   |           ZQXjTGdGXfYzXi535O4H_g==
|       |   |   |           qHgt0CovAWTuOkItEQAa8A==
|       |   |   |           jtFYifL21q3EdhGj_ovGTA==
|       |   |   |           ziFdKT0bYRyEGhemP0OS+w==
|       |   |   |           3dxgEtj4E_mexgkYYrZUbQ==
|       |   |   |           4zAq7jvuQJO3OFG7Ujl_pA==
|       |   |   |           FZ1svj1oActQc31OvJJRow==
|       |   |   |           +nl9meW+f4uPnV4kIFp9lw==
|       |   |   |           sjeQlWz5GgNMD2hH_MjstQ==
|       |   |   |           a_FX4Io9AiqtnIFqxGJJrg==
|       |   |   |           60mx45gh5miPQVVkpCvnLg==
|       |   |   |           c7xlJoRb3OLd5IDwCmw5KA==
|       |   |   |           yRCxh2Vj9H_as1mGgnA5Sg==
|       |   |   |           48BaeKGNdJFL8d_MSSOubQ==
|       |   |   |           zzicDJnz0GHqG5STtnUq0A==
|       |   |   |           +yRz4R5Q9egD6vsmreNzwg==
|       |   |   |           Z7_SQc4lz2bef86KIczMCg==
|       |   |   |           M2LPS3XCAvPG_EIq1KmDFg==
|       |   |   |           ZbowjYqrohFH0kU9NbD92w==
|       |   |   |           7TFEEiCrfNtGngUqEEZ4_g==
|       |   |   |           _WMZKLWtGPr5yNJj5zAdUA==
|       |   |   |           R8QGYLzhagVwLjoZtXiqZw==
|       |   |   |           QGOjUyLKz70atatXUB2HNw==
|       |   |   |           B_5gRDYV+Qf00AWFQTAk2w==
|       |   |   |           ymlAnLcV+QbrEFB5yLGZ9A==
|       |   |   |           84zQK0_eeLI4EL62GWFp0A==
|       |   |   |           GDXALbnc8Ud2GfR3LYHkjA==
|       |   |   |           jZlXUOci2ouaRxAlvr0jZg==
|       |   |   |           y8PcNJskgFqT5LD_vYXzVQ==
|       |   |   |           khBPeE4kIlImqz8kjiSCKg==
|       |   |   |           Wof0Ev9XER7IaFNCHGn40Q==
|       |   |   |           THsp94HgVG3OCjNgGrQZXA==
|       |   |   |           l8oSnU8wKqW4mX0r8cZkpA==
|       |   |   |           f+Db7t_Bhn9oRSqfzsZOfQ==
|       |   |   |           5kN2f1CMn6BeCBAE_nHhLQ==
|       |   |   |           5XLD2ovJ5jmx2vOQSSSl3A==
|       |   |   |           SGI77XbAW7ETK8x1zMxH8A==
|       |   |   |           mEfmcbLziOFgaVIkXvttDg==
|       |   |   |           jZyw2PmltTzj88b+th3p8g==
|       |   |   |           BfnDscqTvRuOGTrIhkPnfQ==
|       |   |   |           _7tYdAzaq4cI80v6TCtF9w==
|       |   |   |           hUX4sVPFuxrU2YQNNmQ9Rw==
|       |   |   |           sdX+NFUavrA7I3oC_z2ZDQ==
|       |   |   |           JDqqMP7mw2VobIs53MHIMQ==
|       |   |   |           lCYWec1PBPBvcJNqINlgSw==
|       |   |   |           zEMHVoNN1L+6zAC3C6h0Iw==
|       |   |   |           WF_x_SIb0M0JiAXYN2PszQ==
|       |   |   |           x+bDnEdLsnbIDump3MKXWA==
|       |   |   |           ZEpRNGAf2R34+Y9wSx_K7A==
|       |   |   |           A+wDflYxju_AuBiP59u3kQ==
|       |   |   |           kUoAu98Ts__XpR6BdT82ag==
|       |   |   |           pR+EaWqt47b71335+Wbt4Q==
|       |   |   |           7MQ3SpsxwLsqPU7jg0wOTA==
|       |   |   |           8KKrY0I_fa8cAX_BU1qtHw==
|       |   |   |           4ikI+5QddN1HVse1TsCiKw==
|       |   |   |           zMUJWL6R4YT+LzpHt9c5Qg==
|       |   |   |
|       |   |   \---packageDebug
|       |   |       \---tmp
|       |   |           \---debug
|       |   |               |   dex-renamer-state.txt
|       |   |               |
|       |   |               \---zip-cache
|       |   |                       javaResources0
|       |   |                       androidResources
|       |   |
|       |   +---global_synthetics_dex
|       |   |   \---debug
|       |   |       \---generateDebugGlobalSynthetics
|       |   |               classes.dex
|       |   |
|       |   +---duplicate_classes_check
|       |   |   \---debug
|       |   |       \---checkDebugDuplicateClasses
|       |   +---data_binding_layout_info_type_package
|       |   |   \---debug
|       |   |       \---packageDebugResources
|       |   |           \---out
|       |   +---external_file_lib_dex_archives
|       |   |   \---debug
|       |   |       \---desugarDebugFileDependencies
|       |   +---global_synthetics_file_lib
|       |   |   \---debug
|       |   |       \---desugarDebugFileDependencies
|       |   +---packaged_res
|       |   |   \---debug
|       |   |       \---packageDebugResources
|       |   |           +---values
|       |   |           |       values.xml
|       |   |           |
|       |   |           +---mipmap-xxhdpi-v4
|       |   |           |       ic_launcher_round.webp
|       |   |           |       ic_launcher.webp
|       |   |           |
|       |   |           +---mipmap-hdpi-v4
|       |   |           |       ic_launcher_round.webp
|       |   |           |       ic_launcher.webp
|       |   |           |
|       |   |           +---mipmap-xxxhdpi-v4
|       |   |           |       ic_launcher_round.webp
|       |   |           |       ic_launcher.webp
|       |   |           |
|       |   |           +---mipmap-xhdpi-v4
|       |   |           |       ic_launcher.webp
|       |   |           |       ic_launcher_round.webp
|       |   |           |
|       |   |           +---mipmap-mdpi-v4
|       |   |           |       ic_launcher_round.webp
|       |   |           |       ic_launcher.webp
|       |   |           |
|       |   |           +---drawable
|       |   |           |       ic_launcher_background.xml
|       |   |           |       ic_launcher_foreground.xml
|       |   |           |
|       |   |           +---xml
|       |   |           |       backup_rules.xml
|       |   |           |       file_paths.xml
|       |   |           |       data_extraction_rules.xml
|       |   |           |
|       |   |           \---mipmap-anydpi-v26
|       |   |                   ic_launcher.xml
|       |   |                   ic_launcher_round.xml
|       |   |
|       |   +---dex
|       |   |   \---debug
|       |   |       +---mergeExtDexDebug
|       |   |       |       classes3.dex
|       |   |       |       classes2.dex
|       |   |       |       classes.dex
|       |   |       |
|       |   |       +---mergeLibDexDebug
|       |   |       |   +---0
|       |   |       |   +---1
|       |   |       |   +---2
|       |   |       |   +---3
|       |   |       |   +---4
|       |   |       |   +---5
|       |   |       |   +---6
|       |   |       |   +---7
|       |   |       |   +---8
|       |   |       |   +---9
|       |   |       |   +---10
|       |   |       |   +---11
|       |   |       |   +---12
|       |   |       |   +---13
|       |   |       |   +---14
|       |   |       |   \---15
|       |   |       \---mergeProjectDexDebug
|       |   |           +---0
|       |   |           |       classes.dex
|       |   |           |
|       |   |           +---1
|       |   |           |       classes.dex
|       |   |           |
|       |   |           +---2
|       |   |           |       classes.dex
|       |   |           |
|       |   |           +---3
|       |   |           +---4
|       |   |           +---5
|       |   |           +---6
|       |   |           +---7
|       |   |           +---8
|       |   |           +---9
|       |   |           +---10
|       |   |           +---11
|       |   |           +---12
|       |   |           +---13
|       |   |           +---14
|       |   |           \---15
|       |   +---compressed_assets
|       |   |   \---debug
|       |   |       \---compressDebugAssets
|       |   |           \---out
|       |   |               \---assets
|       |   |                   \---mlkit_barcode_models
|       |   |                           oned_auto_regressor_mobile.tflite.jar
|       |   |                           barcode_ssd_mobilenet_v1_dmp25_quant.tflite.jar
|       |   |                           oned_feature_extractor_mobile.tflite.jar
|       |   |
|       |   +---android_res_source_set_path_map
|       |   |   \---debug
|       |   |       \---mapDebugSourceSetPaths
|       |   |               file-map.txt
|       |   |
|       |   +---aar_metadata_check
|       |   |   \---debug
|       |   |       \---checkDebugAarMetadata
|       |   +---merged_res_blame_folder
|       |   |   \---debug
|       |   |       \---mergeDebugResources
|       |   |           \---out
|       |   |               +---multi-v2
|       |   |               |       values-pl.json
|       |   |               |       values-sk.json
|       |   |               |       values-zh-rCN.json
|       |   |               |       values-ka.json
|       |   |               |       values-large-v4.json
|       |   |               |       values-land.json
|       |   |               |       values-kn.json
|       |   |               |       values-de.json
|       |   |               |       values-be.json
|       |   |               |       values-nl.json
|       |   |               |       values-pt-rPT.json
|       |   |               |       values-ar.json
|       |   |               |       values-b+sr+Latn.json
|       |   |               |       values-km.json
|       |   |               |       values-sr.json
|       |   |               |       mergeDebugResources.json
|       |   |               |       values-sl.json
|       |   |               |       values-kk.json
|       |   |               |       values-af.json
|       |   |               |       values-bs.json
|       |   |               |       values.json
|       |   |               |       values-v17.json
|       |   |               |       values-xlarge-v4.json
|       |   |               |       values-vi.json
|       |   |               |       values-ru.json
|       |   |               |       values-my.json
|       |   |               |       values-lt.json
|       |   |               |       values-v21.json
|       |   |               |       values-it.json
|       |   |               |       values-night-v8.json
|       |   |               |       values-is.json
|       |   |               |       values-te.json
|       |   |               |       values-fr.json
|       |   |               |       values-fa.json
|       |   |               |       values-v22.json
|       |   |               |       values-or.json
|       |   |               |       values-in.json
|       |   |               |       values-hi.json
|       |   |               |       values-hu.json
|       |   |               |       values-eu.json
|       |   |               |       values-port.json
|       |   |               |       values-lv.json
|       |   |               |       values-gl.json
|       |   |               |       values-el.json
|       |   |               |       values-sq.json
|       |   |               |       values-ro.json
|       |   |               |       values-hy.json
|       |   |               |       values-v16.json
|       |   |               |       values-en-rAU.json
|       |   |               |       values-zu.json
|       |   |               |       values-v23.json
|       |   |               |       values-as.json
|       |   |               |       values-gu.json
|       |   |               |       values-v31.json
|       |   |               |       values-watch-v20.json
|       |   |               |       values-v24.json
|       |   |               |       values-zh-rHK.json
|       |   |               |       values-mr.json
|       |   |               |       values-pa.json
|       |   |               |       values-es-rUS.json
|       |   |               |       values-az.json
|       |   |               |       values-v30.json
|       |   |               |       values-ldltr-v21.json
|       |   |               |       values-zh-rTW.json
|       |   |               |       values-ky.json
|       |   |               |       values-ca.json
|       |   |               |       values-hdpi-v4.json
|       |   |               |       values-ur.json
|       |   |               |       values-et.json
|       |   |               |       values-pt.json
|       |   |               |       values-h720dp-v13.json
|       |   |               |       values-ja.json
|       |   |               |       values-watch-v21.json
|       |   |               |       values-v25.json
|       |   |               |       values-th.json
|       |   |               |       values-en-rXC.json
|       |   |               |       values-sw600dp-v13.json
|       |   |               |       values-cs.json
|       |   |               |       values-hr.json
|       |   |               |       values-ko.json
|       |   |               |       values-ml.json
|       |   |               |       values-bn.json
|       |   |               |       values-iw.json
|       |   |               |       values-night-v31.json
|       |   |               |       values-v18.json
|       |   |               |       values-sv.json
|       |   |               |       values-en-rGB.json
|       |   |               |       values-pt-rBR.json
|       |   |               |       values-ta.json
|       |   |               |       values-da.json
|       |   |               |       values-v26.json
|       |   |               |       values-tl.json
|       |   |               |       values-ms.json
|       |   |               |       values-mk.json
|       |   |               |       values-uz.json
|       |   |               |       values-tr.json
|       |   |               |       values-en-rCA.json
|       |   |               |       values-nb.json
|       |   |               |       values-ne.json
|       |   |               |       values-en-rIN.json
|       |   |               |       values-v28.json
|       |   |               |       values-es.json
|       |   |               |       values-lo.json
|       |   |               |       values-fi.json
|       |   |               |       values-fr-rCA.json
|       |   |               |       values-mn.json
|       |   |               |       values-bg.json
|       |   |               |       values-sw.json
|       |   |               |       values-si.json
|       |   |               |       values-am.json
|       |   |               |       values-uk.json
|       |   |               |
|       |   |               \---single
|       |   |                       mergeDebugResources.json
|       |   |
|       |   +---compiled_navigation_res
|       |   |   \---debug
|       |   |       \---compileDebugNavigationResources
|       |   +---data_binding_layout_info_type_merge
|       |   |   \---debug
|       |   |       \---mergeDebugResources
|       |   |           \---out
|       |   +---compatible_screen_manifest
|       |   |   \---debug
|       |   |       \---createDebugCompatibleScreenManifests
|       |   |               output-metadata.json
|       |   |
|       |   +---merged_res
|       |   |   \---debug
|       |   |       \---mergeDebugResources
|       |   |               values-hi_values-hi.arsc.flat
|       |   |               values-pt_values-pt.arsc.flat
|       |   |               values_values.arsc.flat
|       |   |               values-hu_values-hu.arsc.flat
|       |   |               values-hr_values-hr.arsc.flat
|       |   |               values-watch-v20_values-watch-v20.arsc.flat
|       |   |               values-v17_values-v17.arsc.flat
|       |   |               values-v18_values-v18.arsc.flat
|       |   |               values-v16_values-v16.arsc.flat
|       |   |               values-zh-rHK_values-zh-rHK.arsc.flat
|       |   |               values-in_values-in.arsc.flat
|       |   |               values-af_values-af.arsc.flat
|       |   |               values-iw_values-iw.arsc.flat
|       |   |               values-am_values-am.arsc.flat
|       |   |               values-it_values-it.arsc.flat
|       |   |               values-v21_values-v21.arsc.flat
|       |   |               values-ar_values-ar.arsc.flat
|       |   |               values-as_values-as.arsc.flat
|       |   |               values-v22_values-v22.arsc.flat
|       |   |               values-v23_values-v23.arsc.flat
|       |   |               values-ja_values-ja.arsc.flat
|       |   |               values-pt-rPT_values-pt-rPT.arsc.flat
|       |   |               values-v24_values-v24.arsc.flat
|       |   |               values-az_values-az.arsc.flat
|       |   |               values-v28_values-v28.arsc.flat
|       |   |               values-ro_values-ro.arsc.flat
|       |   |               values-v26_values-v26.arsc.flat
|       |   |               values-bg_values-bg.arsc.flat
|       |   |               values-ru_values-ru.arsc.flat
|       |   |               values-be_values-be.arsc.flat
|       |   |               values-bs_values-bs.arsc.flat
|       |   |               values-en-rCA_values-en-rCA.arsc.flat
|       |   |               values-si_values-si.arsc.flat
|       |   |               values-ca_values-ca.arsc.flat
|       |   |               values-kn_values-kn.arsc.flat
|       |   |               values-bn_values-bn.arsc.flat
|       |   |               values-ta_values-ta.arsc.flat
|       |   |               values-ka_values-ka.arsc.flat
|       |   |               values-v31_values-v31.arsc.flat
|       |   |               values-h720dp-v13_values-h720dp-v13.arsc.flat
|       |   |               values-sq_values-sq.arsc.flat
|       |   |               values-sl_values-sl.arsc.flat
|       |   |               values-xlarge-v4_values-xlarge-v4.arsc.flat
|       |   |               values-km_values-km.arsc.flat
|       |   |               values-kk_values-kk.arsc.flat
|       |   |               values-de_values-de.arsc.flat
|       |   |               values-sw_values-sw.arsc.flat
|       |   |               values-ko_values-ko.arsc.flat
|       |   |               values-en-rIN_values-en-rIN.arsc.flat
|       |   |               values-cs_values-cs.arsc.flat
|       |   |               values-pt-rBR_values-pt-rBR.arsc.flat
|       |   |               values-tl_values-tl.arsc.flat
|       |   |               values-ml_values-ml.arsc.flat
|       |   |               values-th_values-th.arsc.flat
|       |   |               values-en-rAU_values-en-rAU.arsc.flat
|       |   |               values-mr_values-mr.arsc.flat
|       |   |               values-tr_values-tr.arsc.flat
|       |   |               values-lv_values-lv.arsc.flat
|       |   |               values-my_values-my.arsc.flat
|       |   |               values-lt_values-lt.arsc.flat
|       |   |               values-mk_values-mk.arsc.flat
|       |   |               values-ur_values-ur.arsc.flat
|       |   |               values-vi_values-vi.arsc.flat
|       |   |               values-fr-rCA_values-fr-rCA.arsc.flat
|       |   |               values-ne_values-ne.arsc.flat
|       |   |               values-uz_values-uz.arsc.flat
|       |   |               values-zh-rTW_values-zh-rTW.arsc.flat
|       |   |               values-el_values-el.arsc.flat
|       |   |               values-fi_values-fi.arsc.flat
|       |   |               values-eu_values-eu.arsc.flat
|       |   |               values-hdpi-v4_values-hdpi-v4.arsc.flat
|       |   |               values-et_values-et.arsc.flat
|       |   |               values-night-v8_values-night-v8.arsc.flat
|       |   |               values-port_values-port.arsc.flat
|       |   |               values-gl_values-gl.arsc.flat
|       |   |               values-zh-rCN_values-zh-rCN.arsc.flat
|       |   |               mipmap-mdpi_ic_launcher.webp.flat
|       |   |               values-nl_values-nl.arsc.flat
|       |   |               values-large-v4_values-large-v4.arsc.flat
|       |   |               mipmap-mdpi_ic_launcher_round.webp.flat
|       |   |               values-fr_values-fr.arsc.flat
|       |   |               values-or_values-or.arsc.flat
|       |   |               xml_file_paths.xml.flat
|       |   |               values-pl_values-pl.arsc.flat
|       |   |               mipmap-hdpi_ic_launcher_round.webp.flat
|       |   |               values-land_values-land.arsc.flat
|       |   |               mipmap-xxhdpi_ic_launcher.webp.flat
|       |   |               mipmap-xxxhdpi_ic_launcher_round.webp.flat
|       |   |               mipmap-anydpi-v26_ic_launcher_round.xml.flat
|       |   |               values-pa_values-pa.arsc.flat
|       |   |               values-watch-v21_values-watch-v21.arsc.flat
|       |   |               drawable_ic_launcher_background.xml.flat
|       |   |               mipmap-xhdpi_ic_launcher.webp.flat
|       |   |               values-hy_values-hy.arsc.flat
|       |   |               xml_data_extraction_rules.xml.flat
|       |   |               mipmap-xxhdpi_ic_launcher_round.webp.flat
|       |   |               mipmap-xhdpi_ic_launcher_round.webp.flat
|       |   |               values-ldltr-v21_values-ldltr-v21.arsc.flat
|       |   |               xml_backup_rules.xml.flat
|       |   |               values-is_values-is.arsc.flat
|       |   |               values-b+sr+Latn_values-b+sr+Latn.arsc.flat
|       |   |               values-es-rUS_values-es-rUS.arsc.flat
|       |   |               values-v25_values-v25.arsc.flat
|       |   |               values-zu_values-zu.arsc.flat
|       |   |               values-sw600dp-v13_values-sw600dp-v13.arsc.flat
|       |   |               values-night-v31_values-night-v31.arsc.flat
|       |   |               values-v30_values-v30.arsc.flat
|       |   |               values-sk_values-sk.arsc.flat
|       |   |               values-sr_values-sr.arsc.flat
|       |   |               values-sv_values-sv.arsc.flat
|       |   |               values-ky_values-ky.arsc.flat
|       |   |               values-te_values-te.arsc.flat
|       |   |               values-da_values-da.arsc.flat
|       |   |               values-lo_values-lo.arsc.flat
|       |   |               values-uk_values-uk.arsc.flat
|       |   |               values-mn_values-mn.arsc.flat
|       |   |               values-ms_values-ms.arsc.flat
|       |   |               values-es_values-es.arsc.flat
|       |   |               values-nb_values-nb.arsc.flat
|       |   |               values-fa_values-fa.arsc.flat
|       |   |               values-en-rXC_values-en-rXC.arsc.flat
|       |   |               values-en-rGB_values-en-rGB.arsc.flat
|       |   |               values-gu_values-gu.arsc.flat
|       |   |               drawable_ic_launcher_foreground.xml.flat
|       |   |               mipmap-xxxhdpi_ic_launcher.webp.flat
|       |   |               mipmap-anydpi-v26_ic_launcher.xml.flat
|       |   |               mipmap-hdpi_ic_launcher.webp.flat
|       |   |
|       |   +---navigation_json
|       |   |   \---debug
|       |   |       \---extractDeepLinksDebug
|       |   |               navigation.json
|       |   |
|       |   +---manifest_merge_blame_file
|       |   |   \---debug
|       |   |       \---processDebugMainManifest
|       |   |               manifest-merger-blame-debug-report.txt
|       |   |
|       |   +---merged_manifest
|       |   |   \---debug
|       |   |       \---processDebugMainManifest
|       |   |               AndroidManifest.xml
|       |   |
|       |   +---merged_manifests
|       |   |   \---debug
|       |   |       \---processDebugManifest
|       |   |               AndroidManifest.xml
|       |   |               output-metadata.json
|       |   |
|       |   +---packaged_manifests
|       |   |   \---debug
|       |   |       \---processDebugManifestForPackage
|       |   |               AndroidManifest.xml
|       |   |               output-metadata.json
|       |   |
|       |   +---merged_jni_libs
|       |   |   \---debug
|       |   |       \---mergeDebugJniLibFolders
|       |   |           \---out
|       |   +---validate_signing_config
|       |   |   \---debug
|       |   |       \---validateSigningDebug
|       |   +---merged_native_libs
|       |   |   \---debug
|       |   |       \---mergeDebugNativeLibs
|       |   |           \---out
|       |   |               \---lib
|       |   |                   +---arm64-v8a
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |
|       |   |                   +---armeabi-v7a
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |
|       |   |                   +---x86
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |
|       |   |                   \---x86_64
|       |   |                           libimage_processing_util_jni.so
|       |   |                           libbarhopper_v3.so
|       |   |                           libandroidx.graphics.path.so
|       |   |
|       |   +---app_metadata
|       |   |   \---debug
|       |   |       \---writeDebugAppMetadata
|       |   |               app-metadata.properties
|       |   |
|       |   +---merged_test_only_native_libs
|       |   |   \---debug
|       |   |       \---mergeDebugNativeLibs
|       |   |           \---out
|       |   +---signing_config_versions
|       |   |   \---debug
|       |   |       \---writeDebugSigningConfigVersions
|       |   |               signing-config-versions.json
|       |   |
|       |   +---local_only_symbol_list
|       |   |   \---debug
|       |   |       \---parseDebugLocalResources
|       |   |               R-def.txt
|       |   |
|       |   +---compile_r_class_jar
|       |   |   \---debug
|       |   |       \---generateDebugRFile
|       |   |               R.jar
|       |   |
|       |   +---symbol_list_with_package_name
|       |   |   \---debug
|       |   |       \---generateDebugRFile
|       |   |               package-aware-r.txt
|       |   |
|       |   +---compile_symbol_list
|       |   |   \---debug
|       |   |       \---generateDebugRFile
|       |   |               R.txt
|       |   |
|       |   +---built_in_kotlinc
|       |   |   \---debug
|       |   |       \---compileDebugKotlin
|       |   |           \---classes
|       |   |               +---com
|       |   |               |   \---example
|       |   |               |       \---ohrana
|       |   |               |           |   ComposableSingletons$AdministratorScreenKt.class
|       |   |               |           |   AdministratorScreenKt.class
|       |   |               |           |   RouteAlarm.class
|       |   |               |           |   AlarmReceiver.class
|       |   |               |           |   AlarmScheduler.class
|       |   |               |           |   AlarmService.class
|       |   |               |           |   Employee.class
|       |   |               |           |   ComposableSingletons$EmployeeListScreenKt.class
|       |   |               |           |   EmployeeListScreenKt.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.class
|       |   |               |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.class
|       |   |               |           |   MainActivity.class
|       |   |               |           |   ComposableSingletons$MainActivityKt.class
|       |   |               |           |   MainActivityKt.class
|       |   |               |           |   ComposableSingletons$MarshrutiKt.class
|       |   |               |           |   MarshrutiKt.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$1$1.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$2$1.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$3$1.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$5$1$1$4$1$1$1.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$1.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$2.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$3.class
|       |   |               |           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$4.class
|       |   |               |           |   ComposableSingletons$OhrannikScreenKt.class
|       |   |               |           |   OhrannikScreenKt.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.class
|       |   |               |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.class
|       |   |               |           |   ComposableSingletons$OhrannikShiftControlKt.class
|       |   |               |           |   OhrannikShiftControlKt.class
|       |   |               |           |   ComposableSingletons$PrivetScreenKt.class
|       |   |               |           |   PrivetScreenKt.class
|       |   |               |           |   CheckpointEntry.class
|       |   |               |           |   QrResult.class
|       |   |               |           |   QrResult$Checkpoint.class
|       |   |               |           |   QrResult$ShiftReportTrigger.class
|       |   |               |           |   QrResult$Error.class
|       |   |               |           |   QrHandler.class
|       |   |               |           |   QrScanRecord.class
|       |   |               |           |   SharedPrefsManager.class
|       |   |               |           |   SharedPrefsManager$loadRouteAlarms$$inlined$sortedBy$1.class
|       |   |               |           |   ComposableSingletons$SpisokOtchetovKt.class
|       |   |               |           |   SpisokOtchetovKt.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$1.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$2.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$3.class
|       |   |               |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$4.class
|       |   |               |           |   ComposableSingletons$OhrannikCabinetScreenKt.class
|       |   |               |           |   OhrannikCabinetScreenKt.class
|       |   |               |           |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.class
|       |   |               |           |
|       |   |               |           \---ui
|       |   |               |               \---theme
|       |   |               |                       ColorKt.class
|       |   |               |                       ThemeKt.class
|       |   |               |                       TypeKt.class
|       |   |               |
|       |   |               \---META-INF
|       |   |                       app.kotlin_module
|       |   |
|       |   +---stripped_native_libs
|       |   |   \---debug
|       |   |       \---stripDebugDebugSymbols
|       |   |           \---out
|       |   |               \---lib
|       |   |                   +---arm64-v8a
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |
|       |   |                   +---armeabi-v7a
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |
|       |   |                   +---x86
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |
|       |   |                   \---x86_64
|       |   |                           libandroidx.graphics.path.so
|       |   |                           libbarhopper_v3.so
|       |   |                           libimage_processing_util_jni.so
|       |   |
|       |   +---compile_and_runtime_r_class_jar
|       |   |   \---debug
|       |   |       \---processDebugResources
|       |   |               R.jar
|       |   |
|       |   +---linked_resources_binary_format
|       |   |   \---debug
|       |   |       \---processDebugResources
|       |   |               linked-resources-binary-format-debug.ap_
|       |   |               output-metadata.json
|       |   |
|       |   +---stable_resource_ids_file
|       |   |   \---debug
|       |   |       \---processDebugResources
|       |   |               stableIds.txt
|       |   |
|       |   +---runtime_symbol_list
|       |   |   \---debug
|       |   |       \---processDebugResources
|       |   |               R.txt
|       |   |
|       |   +---java_res
|       |   |   \---debug
|       |   |       \---processDebugJavaRes
|       |   |           \---out
|       |   |               +---META-INF
|       |   |               |       app.kotlin_module
|       |   |               |
|       |   |               \---com
|       |   |                   \---example
|       |   |                       \---ohrana
|       |   |                           \---ui
|       |   |                               \---theme
|       |   +---external_libs_dex_archive_with_artifact_transforms
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---global_synthetics_external_libs_artifact_transform
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---external_libs_dex_archive
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---global_synthetics_external_lib
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---mixed_scope_dex_archive
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---global_synthetics_mixed_scope
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---project_dex_archive
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   |               |   de4c8eea989f0312839259f26d601a0156587ba248eadf96a22da43f53639857_1.jar
|       |   |               |   de4c8eea989f0312839259f26d601a0156587ba248eadf96a22da43f53639857_0.jar
|       |   |               |
|       |   |               \---com
|       |   |                   \---example
|       |   |                       \---ohrana
|       |   |                           |   CheckpointEntry.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$1.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$3$1.dex
|       |   |                           |   MarshrutiKt.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$4.dex
|       |   |                           |   ComposableSingletons$EmployeeListScreenKt.dex
|       |   |                           |   ComposableSingletons$OhrannikCabinetScreenKt.dex
|       |   |                           |   ComposableSingletons$AdministratorScreenKt.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$1.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.dex
|       |   |                           |   MainActivity.dex
|       |   |                           |   QrResult$Error.dex
|       |   |                           |   QrHandler.dex
|       |   |                           |   SpisokOtchetovKt.dex
|       |   |                           |   ComposableSingletons$OhrannikShiftControlKt.dex
|       |   |                           |   QrResult$Checkpoint.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.dex
|       |   |                           |   OhrannikShiftControlKt.dex
|       |   |                           |   PrivetScreenKt.dex
|       |   |                           |   ComposableSingletons$PrivetScreenKt.dex
|       |   |                           |   AlarmScheduler.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.dex
|       |   |                           |   MainActivityKt.dex
|       |   |                           |   AlarmReceiver.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.dex
|       |   |                           |   ComposableSingletons$MainActivityKt.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$1$1.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$2$1.dex
|       |   |                           |   OhrannikScreenKt.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.dex
|       |   |                           |   QrScanRecord.dex
|       |   |                           |   RouteAlarm.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$2.dex
|       |   |                           |   QrResult$ShiftReportTrigger.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$3.dex
|       |   |                           |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.dex
|       |   |                           |   Employee.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$2.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$5$1$1$4$1$1$1.dex
|       |   |                           |   ComposableSingletons$OhrannikScreenKt.dex
|       |   |                           |   ComposableSingletons$MarshrutiKt.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$3.dex
|       |   |                           |   SharedPrefsManager$loadRouteAlarms$$inlined$sortedBy$1.dex
|       |   |                           |   AlarmService.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.dex
|       |   |                           |   SharedPrefsManager.dex
|       |   |                           |   EmployeeListScreenKt.dex
|       |   |                           |   AdministratorScreenKt.dex
|       |   |                           |   ComposableSingletons$SpisokOtchetovKt.dex
|       |   |                           |   QrResult.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.dex
|       |   |                           |   MarshrutiKt$MarshrutiScreen$lambda$60$lambda$59$lambda$58$$inlined$items$default$4.dex
|       |   |                           |   OhrannikCabinetScreenKt.dex
|       |   |                           |
|       |   |                           \---ui
|       |   |                               \---theme
|       |   |                                       ThemeKt.dex
|       |   |                                       ColorKt.dex
|       |   |                                       TypeKt.dex
|       |   |
|       |   +---global_synthetics_project
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---sub_project_dex_archive
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---global_synthetics_subproject
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   +---desugar_graph
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |           \---out
|       |   |               +---currentProject
|       |   |               |   +---jar_133561ecbcf55688e806a729d85a2e5b8fa33673fb11677f88c56fedd4a5cee6_bucket_1
|       |   |               |   |       graph.bin
|       |   |               |   |
|       |   |               |   +---jar_133561ecbcf55688e806a729d85a2e5b8fa33673fb11677f88c56fedd4a5cee6_bucket_0
|       |   |               |   |       graph.bin
|       |   |               |   |
|       |   |               |   +---dirs_bucket_1
|       |   |               |   |       graph.bin
|       |   |               |   |
|       |   |               |   \---dirs_bucket_0
|       |   |               |           graph.bin
|       |   |               |
|       |   |               +---otherProjects
|       |   |               |   +---dirs_bucket_1
|       |   |               |   |       graph.bin
|       |   |               |   |
|       |   |               |   \---dirs_bucket_0
|       |   |               |           graph.bin
|       |   |               |
|       |   |               +---mixedScopes
|       |   |               |   +---dirs_bucket_0
|       |   |               |   |       graph.bin
|       |   |               |   |
|       |   |               |   \---dirs_bucket_1
|       |   |               |           graph.bin
|       |   |               |
|       |   |               \---externalLibs
|       |   |                   +---dirs_bucket_0
|       |   |                   |       graph.bin
|       |   |                   |
|       |   |                   \---dirs_bucket_1
|       |   |                           graph.bin
|       |   |
|       |   +---dex_archive_input_jar_hashes
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |               out
|       |   |
|       |   +---dex_number_of_buckets_file
|       |   |   \---debug
|       |   |       \---dexBuilderDebug
|       |   |               out
|       |   |
|       |   +---merged_java_res
|       |   |   \---debug
|       |   |       \---mergeDebugJavaResource
|       |   |               base.jar
|       |   |
|       |   +---apk_ide_redirect_file
|       |   |   \---debug
|       |   |       \---createDebugApkListingFileRedirect
|       |   |               redirect.txt
|       |   |
|       |   \---apk
|       |       \---debug
|       |               app-debug.apk
|       |               output-metadata.json
|       |
|       +---generated
|       |   +---updated_navigation_xml
|       |   |   \---debug
|       |   \---res
|       |       \---pngs
|       |           \---debug
|       +---outputs
|       |   +---logs
|       |   |       manifest-merger-debug-report.txt
|       |   |
|       |   \---apk
|       |       \---debug
|       |               app-debug.apk
|       |               output-metadata.json
|       |
|       \---kotlin
|           \---compileDebugKotlin
|               +---classpath-snapshot
|               |       shrunk-classpath-snapshot.bin
|               |
|               +---cacheable
|               |   |   last-build.bin
|               |   |
|               |   \---caches-jvm
|               |       +---inputs
|               |       |       source-to-output.tab.len
|               |       |       source-to-output.tab
|               |       |       source-to-output.tab_i.len
|               |       |       source-to-output.tab.keystream.len
|               |       |       source-to-output.tab_i
|               |       |       source-to-output.tab.values.at
|               |       |       source-to-output.tab.keystream
|               |       |
|               |       +---lookups
|               |       |       id-to-file.tab.len
|               |       |       id-to-file.tab
|               |       |       id-to-file.tab_i.len
|               |       |       id-to-file.tab.keystream.len
|               |       |       id-to-file.tab_i
|               |       |       id-to-file.tab.values.at
|               |       |       id-to-file.tab.keystream
|               |       |       file-to-id.tab.len
|               |       |       file-to-id.tab
|               |       |       file-to-id.tab_i.len
|               |       |       file-to-id.tab.keystream.len
|               |       |       file-to-id.tab_i
|               |       |       file-to-id.tab.values.at
|               |       |       file-to-id.tab.keystream
|               |       |       lookups.tab.len
|               |       |       lookups.tab
|               |       |       lookups.tab_i.len
|               |       |       lookups.tab.keystream.len
|               |       |       lookups.tab_i
|               |       |       lookups.tab.keystream
|               |       |       lookups.tab.values.at
|               |       |       counters.tab
|               |       |
|               |       \---jvm
|               |           \---kotlin
|               |                   class-attributes.tab.len
|               |                   class-attributes.tab
|               |                   class-attributes.tab_i.len
|               |                   class-attributes.tab.keystream.len
|               |                   class-attributes.tab_i
|               |                   class-attributes.tab.values.at
|               |                   class-attributes.tab.keystream
|               |                   subtypes.tab.len
|               |                   subtypes.tab
|               |                   subtypes.tab_i.len
|               |                   subtypes.tab.keystream.len
|               |                   subtypes.tab_i
|               |                   subtypes.tab.values.at
|               |                   subtypes.tab.keystream
|               |                   supertypes.tab.len
|               |                   supertypes.tab
|               |                   supertypes.tab_i.len
|               |                   supertypes.tab.keystream.len
|               |                   supertypes.tab_i
|               |                   supertypes.tab.values.at
|               |                   supertypes.tab.keystream
|               |                   class-fq-name-to-source.tab.len
|               |                   class-fq-name-to-source.tab
|               |                   class-fq-name-to-source.tab_i.len
|               |                   class-fq-name-to-source.tab.keystream.len
|               |                   class-fq-name-to-source.tab_i
|               |                   class-fq-name-to-source.tab.values.at
|               |                   class-fq-name-to-source.tab.keystream
|               |                   source-to-classes.tab.len
|               |                   source-to-classes.tab
|               |                   source-to-classes.tab_i.len
|               |                   source-to-classes.tab.keystream.len
|               |                   source-to-classes.tab_i
|               |                   source-to-classes.tab.values.at
|               |                   source-to-classes.tab.keystream
|               |                   proto.tab.len
|               |                   proto.tab
|               |                   proto.tab_i.len
|               |                   proto.tab.keystream.len
|               |                   proto.tab_i
|               |                   proto.tab.values.at
|               |                   proto.tab.keystream
|               |                   package-parts.tab.len
|               |                   package-parts.tab
|               |                   package-parts.tab_i.len
|               |                   package-parts.tab.keystream.len
|               |                   package-parts.tab_i
|               |                   package-parts.tab.values.at
|               |                   package-parts.tab.keystream
|               |                   internal-name-to-source.tab.len
|               |                   internal-name-to-source.tab
|               |                   internal-name-to-source.tab_i.len
|               |                   internal-name-to-source.tab.keystream.len
|               |                   internal-name-to-source.tab_i
|               |                   internal-name-to-source.tab.keystream
|               |                   internal-name-to-source.tab.values.at
|               |
|               \---local-state
+---gradle
|   |   gradle-daemon-jvm.properties
|   |   libs.versions.toml
|   |
|   \---wrapper
|           gradle-wrapper.jar
|           gradle-wrapper.properties
|
+---.gradle
|   +---9.4.1
|   |   |   gc.properties
|   |   |
|   |   +---fileHashes
|   |   |       fileHashes.lock
|   |   |       fileHashes.bin
|   |   |       resourceHashesCache.bin
|   |   |
|   |   +---fileChanges
|   |   |       last-build.bin
|   |   |
|   |   +---vcsMetadata
|   |   +---checksums
|   |   |       checksums.lock
|   |   |       sha1-checksums.bin
|   |   |       md5-checksums.bin
|   |   |
|   |   +---expanded
|   |   \---executionHistory
|   |           executionHistory.lock
|   |           executionHistory.bin
|   |
|   +---buildOutputCleanup
|   |       buildOutputCleanup.lock
|   |       cache.properties
|   |       outputFiles.bin
|   |
|   +---vcs-1
|   |       gc.properties
|   |
|   \---configuration-cache
|       |   configuration-cache.lock
|       |   gc.properties
|       |
|       +---7b85876f-d110-4460-929e-1bb30f43495b
|       +---2r4by892ng6ref8eceujwucsc
|       |       candidates.bin
|       |
|       +---d227f635-52bc-4ef2-887a-598b6674a588
|       +---75v7kb0q1oxe3jnpy1m8kmf7x
|       |       candidates.bin
|       |
|       +---a3fde228-238b-4db7-9e4d-341523bc71c1
|       |       classloaderscopes7582120250151074190.tmp
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |
|       +---7qygorxtrgflljewt5k14sgfb
|       +---157175d3-09dc-4c12-8fda-a70c39cf4f47
|       +---5rasm1osc55hqy722typsaq81
|       |       candidates.bin
|       |
|       +---a8d15d31-ed6c-4307-ae3e-067c01466acf
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       build.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |
|       +---a2fed33c-9132-43b7-8b6f-ee3bdd3c0e62
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |
|       +---4iz1et2agv3ungpnsujvur58k
|       |       candidates.bin
|       |
|       +---127997f4-2363-4690-acba-fe44dcce46fa
|       +---e2574d5f-f1c8-405e-b46c-e20085ffa262
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |
|       +---ajoe4hg2nr3jr4gud230f4dg5
|       |       candidates.bin
|       |
|       +---44fc678d-4821-4917-b179-5d3999e31dcc
|       +---a9f3177d-ed77-4d6a-a238-126086afcac7
|       +---119c949f-392d-424d-953a-7acef5398daf
|       +---c7cb8ce9-9262-4202-8e1b-da73d4da8d4f
|       +---eec27ef0-56b3-46d1-a364-353562384a0b
|       +---d99c8938-6a25-4fe0-af14-56aa016431e3
|       +---fc9170c8-6bd9-49fc-9bba-a8d47f2023af
|       +---d898346d-3afc-4415-a111-2597c9d5ef3f
|       +---3e9401d5-d8bf-4747-9c6a-d13fb075733a
|       +---9f25901c-9b3c-4697-9eb0-02dec6d31e58
|       +---564eebc6-afbf-4b55-b471-ca1bfd83aa3d
|       +---fd26e58c-15eb-4710-a0c1-bc01037b94ec
|       +---63e6f5af-31c1-44db-a825-10387a3ff5dc
|       +---f48680f7-4360-4cd7-9e74-add9bc4bb622
|       +---e1cfd624-30cc-4d9a-ada9-0099dda45ff7
|       +---92ab1c5d-fb70-48b2-a111-f7cddb7fd310
|       +---8ef27ad4-6e1b-472b-a6b8-c78945422cc0
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |
|       +---5sdw9u7pkrzx25rmnsdtu4hai
|       |       candidates.bin
|       |
|       +---fcb615e9-4da7-4cf8-b868-ea65ecefacc2
|       +---c63ae063-c691-4afa-9702-1873282739cb
|       +---eac6a3d1-24e8-45d2-92f7-cc39d1c1ae51
|       +---8bf1de9d-956e-44fb-b327-0969d4fc03b3
|       +---6c2d63ec-ad93-476a-9169-c7f9ae271b2b
|       +---f3c8b14d-2c66-4827-9b15-284c1e12788f
|       +---8fe9c23f-77c0-4bb2-bc67-8a71eabdd7e8
|       +---4b8b2cf9-d569-4c15-bed5-ab1d8d5f5e6f
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |
|       \---f8587187-7f53-4699-9523-fea4d73258c4
|               .strings.work.bin
|               .globals.work.bin
|               work.bin
|               _app.work.bin
|               buildfingerprint.bin
|               projectfingerprint.bin
|               entry.bin
|               classloaderscopes.bin
|
+---.idea
|   |   AndroidProjectSystem.xml
|   |   misc.xml
|   |   gradle.xml
|   |   runConfigurations.xml
|   |   .gitignore
|   |   workspace.xml
|   |   compiler.xml
|   |   deploymentTargetSelector.xml
|   |   studiobot.xml
|   |   vcs.xml
|   |   markdown.xml
|   |
|   +---caches
|   |       deviceStreaming.xml
|   |
|   +---inspectionProfiles
|   |       Project_Default.xml
|   |
|   \---modules
|       \---app
\---build
\---reports
+---configuration-cache
|   +---2r4by892ng6ref8eceujwucsc
|   |   +---dbb8lzkfiqzf8pobudfq4v0v4
|   |   |       configuration-cache-report.html
|   |   |
|   |   +---8bdm8vqjylwgao27nlww9xuao
|   |   |       configuration-cache-report.html
|   |   |
|   |   +---4tamuee4d8m2qs0iilon4vq77
|   |   |       configuration-cache-report.html
|   |   |
|   |   +---ahjojzqbrgs1rbnhyqvz1nsm
|   |   |       configuration-cache-report.html
|   |   |
|   |   +---e95r03e7zdlooeds577r1a2sb
|   |   |       configuration-cache-report.html
|   |   |
|   |   +---zji7mx4cp41xdhkqruqux74m
|   |   |       configuration-cache-report.html
|   |   |
|   |   \---3eqffy657qtuf983maqyjzlrs
|   |           configuration-cache-report.html
|   |
|   +---75v7kb0q1oxe3jnpy1m8kmf7x
|   |   +---7nxuuq3hh1mky25rpyejgiiv4
|   |   |       configuration-cache-report.html
|   |   |
|   |   \---8v8tfwgbdqnswac7dkgaa3c8q
|   |           configuration-cache-report.html
|   |
|   +---7qygorxtrgflljewt5k14sgfb
|   |   \---8k79stfhjdkkdmss8bxg1iyvv
|   |           configuration-cache-report.html
|   |
|   +---5rasm1osc55hqy722typsaq81
|   |   +---3qnv3x9sqwk23r4n3ja4cqlch
|   |   |       configuration-cache-report.html
|   |   |
|   |   \---618kvntrgraw2xcysxbef3s2s
|   |           configuration-cache-report.html
|   |
|   +---4iz1et2agv3ungpnsujvur58k
|   |   \---8pcwirx8t1oow2yhmx3lcjzi2
|   |           configuration-cache-report.html
|   |
|   +---ajoe4hg2nr3jr4gud230f4dg5
|   |   \---7o1ty73oypds9qf3mmpe7buqy
|   |           configuration-cache-report.html
|   |
|   \---5sdw9u7pkrzx25rmnsdtu4hai
|       \---bneranjw5ykvf5z8uzwy5hofx
|               configuration-cache-report.html
|
\---problems
problems-report.html