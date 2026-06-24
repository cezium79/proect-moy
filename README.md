H:.
|   .gitignore
|   build.gradle.kts
|   gradle.properties
|   gradlew
|   gradlew.bat
|   local.properties
|   settings.gradle.kts
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
|       |   +---annotation_processor_list
|       |   |   +---debug
|       |   |   |   \---javaPreCompileDebug
|       |   |   |           annotationProcessors.json
|       |   |   |           
|       |   |   +---release
|       |   |   |   \---javaPreCompileRelease
|       |   |   |           annotationProcessors.json
|       |   |   |           
|       |   |   \---debugUnitTest
|       |   |       \---javaPreCompileDebugUnitTest
|       |   |               annotationProcessors.json
|       |   |               
|       |   +---nested_resources_validation_report
|       |   |   +---debug
|       |   |   |   \---generateDebugResources
|       |   |   |           nestedResourcesValidationReport.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---generateReleaseResources
|       |   |               nestedResourcesValidationReport.txt
|       |   |               
|       |   +---data_binding_layout_info_type_package
|       |   |   +---debug
|       |   |   |   \---packageDebugResources
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---packageReleaseResources
|       |   |           \---out
|       |   +---assets
|       |   |   +---debug
|       |   |   |   \---mergeDebugAssets
|       |   |   |       +---mlkit-google-ocr-models
|       |   |   |       |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_recognizer.binarypb
|       |   |   |       |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner.binarypb
|       |   |   |       |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine.binarypb
|       |   |   |       |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner_ti.binarypb
|       |   |   |       |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine_ti.binarypb
|       |   |   |       |   |   
|       |   |   |       |   +---taser
|       |   |   |       |   |   |   rpn_text_detection_tflite_mobile_mbv2.binarypb
|       |   |   |       |   |   |   taser_script_identification_tflite_mobile.binarypb
|       |   |   |       |   |   |   
|       |   |   |       |   |   +---segmenter
|       |   |   |       |   |   |       tflite_script_detector_0.3.bincfg
|       |   |   |       |   |   |       tflite_script_detector_0.3.conv_model
|       |   |   |       |   |   |       tflite_script_detector_0.3.lstm_model
|       |   |   |       |   |   |       
|       |   |   |       |   |   \---detector
|       |   |   |       |   |           rpn_text_detector_mobile_space_to_depth_quantized_mbv2_v1.tflite
|       |   |   |       |   |           region_proposal_text_detector_tflite_vertical_mbv2_v1.bincfg
|       |   |   |       |   |           
|       |   |   |       |   +---gocr
|       |   |   |       |   |   +---gocr_models
|       |   |   |       |   |   |   \---line_recognition_legacy_mobile
|       |   |   |       |   |   |       |   tflite_langid.tflite
|       |   |   |       |   |   |       |   Latn_ctc_cpu.binarypb
|       |   |   |       |   |   |       |   
|       |   |   |       |   |   |       \---Latn_ctc
|       |   |   |       |   |   |           \---optical
|       |   |   |       |   |   |               |   conv_model.fb
|       |   |   |       |   |   |               |   lstm_model.fb
|       |   |   |       |   |   |               |   
|       |   |   |       |   |   |               \---assets.extra
|       |   |   |       |   |   |                       LabelMap.pb
|       |   |   |       |   |   |                       
|       |   |   |       |   |   \---layout
|       |   |   |       |   |       +---line_splitting_custom_ops
|       |   |   |       |   |       |       model.tflite
|       |   |   |       |   |       |       
|       |   |   |       |   |       \---line_clustering_custom_ops
|       |   |   |       |   |               model.tflite
|       |   |   |       |   |               
|       |   |   |       |   \---aksara
|       |   |   |       |           aksara_page_layout_analysis_ti_rpn_gcn.binarypb
|       |   |   |       |           aksara_page_layout_analysis_rpn_gcn.binarypb
|       |   |   |       |           
|       |   |   |       \---mlkit_barcode_models
|       |   |   |               barcode_ssd_mobilenet_v1_dmp25_quant.tflite
|       |   |   |               oned_feature_extractor_mobile.tflite
|       |   |   |               oned_auto_regressor_mobile.tflite
|       |   |   |               
|       |   |   \---release
|       |   |       \---mergeReleaseAssets
|       |   |           +---mlkit-google-ocr-models
|       |   |           |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_recognizer.binarypb
|       |   |           |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine.binarypb
|       |   |           |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner.binarypb
|       |   |           |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner_ti.binarypb
|       |   |           |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine_ti.binarypb
|       |   |           |   |   
|       |   |           |   +---taser
|       |   |           |   |   |   taser_script_identification_tflite_mobile.binarypb
|       |   |           |   |   |   rpn_text_detection_tflite_mobile_mbv2.binarypb
|       |   |           |   |   |   
|       |   |           |   |   +---segmenter
|       |   |           |   |   |       tflite_script_detector_0.3.bincfg
|       |   |           |   |   |       tflite_script_detector_0.3.conv_model
|       |   |           |   |   |       tflite_script_detector_0.3.lstm_model
|       |   |           |   |   |       
|       |   |           |   |   \---detector
|       |   |           |   |           rpn_text_detector_mobile_space_to_depth_quantized_mbv2_v1.tflite
|       |   |           |   |           region_proposal_text_detector_tflite_vertical_mbv2_v1.bincfg
|       |   |           |   |           
|       |   |           |   +---gocr
|       |   |           |   |   +---gocr_models
|       |   |           |   |   |   \---line_recognition_legacy_mobile
|       |   |           |   |   |       |   Latn_ctc_cpu.binarypb
|       |   |           |   |   |       |   tflite_langid.tflite
|       |   |           |   |   |       |   
|       |   |           |   |   |       \---Latn_ctc
|       |   |           |   |   |           \---optical
|       |   |           |   |   |               |   lstm_model.fb
|       |   |           |   |   |               |   conv_model.fb
|       |   |           |   |   |               |   
|       |   |           |   |   |               \---assets.extra
|       |   |           |   |   |                       LabelMap.pb
|       |   |           |   |   |                       
|       |   |           |   |   \---layout
|       |   |           |   |       +---line_clustering_custom_ops
|       |   |           |   |       |       model.tflite
|       |   |           |   |       |       
|       |   |           |   |       \---line_splitting_custom_ops
|       |   |           |   |               model.tflite
|       |   |           |   |               
|       |   |           |   \---aksara
|       |   |           |           aksara_page_layout_analysis_rpn_gcn.binarypb
|       |   |           |           aksara_page_layout_analysis_ti_rpn_gcn.binarypb
|       |   |           |           
|       |   |           \---mlkit_barcode_models
|       |   |                   oned_auto_regressor_mobile.tflite
|       |   |                   barcode_ssd_mobilenet_v1_dmp25_quant.tflite
|       |   |                   oned_feature_extractor_mobile.tflite
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
|       |   |   +---mergeReleaseJniLibFolders
|       |   |   |       merger.xml
|       |   |   |       
|       |   |   +---debug-mergeJavaRes
|       |   |   |   |   merge-state
|       |   |   |   |   
|       |   |   |   \---zip-cache
|       |   |   |           IaPh7ohUaklQPOkBhnu_lA==
|       |   |   |           EDOKRAQ_L4I7pLUeJRsaJQ==
|       |   |   |           zw3RFvmea+7Se0AQwQ68aA==
|       |   |   |           2EMSGx5fXWVGzd9Z_qGDxQ==
|       |   |   |           6y0PsUWLw8etVxPdLCZTFg==
|       |   |   |           yHRjm+ag+PuFex+oP44iYQ==
|       |   |   |           his5e3edr2aNvgbeV0JfCg==
|       |   |   |           qs3gWEYRgbbMozrD1QrwUA==
|       |   |   |           N9oTVhR4ZqT7JMCHF5SHjg==
|       |   |   |           vkHEHvEeY12VtvFh5smKQw==
|       |   |   |           ab7nKu0MnNqweSaCne2qBQ==
|       |   |   |           NZeQyFb8UtAhMrusmCfdSw==
|       |   |   |           ysfeAMHHcJwo9jCEVxaA6w==
|       |   |   |           _BM3jK3gdzI8LVc102GDeg==
|       |   |   |           KFe_r_0dznU5wRGe87Y2aQ==
|       |   |   |           ahzaHyPa4aTT6Dsi3k3YFw==
|       |   |   |           Xyeod+vJOazeKv+k9_SMCA==
|       |   |   |           kMSZkCkC+hin+Ywttj+Lmg==
|       |   |   |           7QmvpAS6jtP1dfgYBkhlOw==
|       |   |   |           mjxAM0274fD7DX91K0TLbg==
|       |   |   |           X889nVo4kC9u3+VZbkWvHA==
|       |   |   |           axTHiTQmXt3FdmNXELhXXw==
|       |   |   |           CojpzsrK_AfdWdtQS5HQqQ==
|       |   |   |           Orlza_j93fPLKWmBgD2plw==
|       |   |   |           beH3A0L5+a0bm1xnHHhIrQ==
|       |   |   |           EaYTXECIcVo3mF7aBVH_bQ==
|       |   |   |           Wca6kP4XzITz7HDkLblagQ==
|       |   |   |           hyej6tpsgPFmaFjVriotog==
|       |   |   |           q7WkEPmAB8ICuuz6WA3JSQ==
|       |   |   |           XURjxIt4IDfpirVtDqOoSQ==
|       |   |   |           nCSfKPflbfvHSeJvclARZQ==
|       |   |   |           2Yp2f2b25lnTV13qGEM7Zw==
|       |   |   |           w0JMOYiCg8zQORk0bUDl6g==
|       |   |   |           UAysUjLLzAESReFoMbb8Kw==
|       |   |   |           PypQnM+N20wYDoEBP2BPVw==
|       |   |   |           we8LN6C_H07jpWZzgRcmmA==
|       |   |   |           t2XobXj3LdWWhA07p5KyOg==
|       |   |   |           FTkVld9yuJpxDsrEIJp8hA==
|       |   |   |           GS3_tTzEMs6J974aXKNj4w==
|       |   |   |           qHg8GNlZ7KWAWxppejJ3ng==
|       |   |   |           5VzhvVfHGjuhe3+lxfKAEg==
|       |   |   |           unY_jbP+YosCmPvj4S+XyQ==
|       |   |   |           2zlWz95sbmQ_JE6sNaLYNg==
|       |   |   |           3wih76BnEVGngoFyfIry0A==
|       |   |   |           5By6Ei2NGrBKYH1OD2GLNw==
|       |   |   |           1hf9gCG4rx6a5unwFCUwjw==
|       |   |   |           1iHrzaprqe7U7i9KCcP5ag==
|       |   |   |           XOW4oG1MITJ_LwnZ6C+GZQ==
|       |   |   |           GLq+z1MRYZDIOFJyLn0IIg==
|       |   |   |           jGLqg+TJ90wWGnz7RTakOQ==
|       |   |   |           e1XDAMwJSxXQoZ8BiMkLeA==
|       |   |   |           2f4tpv5Bcq3wmoq5ngs3AA==
|       |   |   |           CRGhA5hpjkmKtVmrpD2Rgg==
|       |   |   |           68pqhJ1zZJWbN60EL0IcSw==
|       |   |   |           Pfe5C1MGFbdr8Vd5RQKV_w==
|       |   |   |           qKi1DtQs0j_WNVKuWEHZKg==
|       |   |   |           H9_QsZXkt53m6vY+2FiKaA==
|       |   |   |           WSHwPRnnaL9euBaian1pmQ==
|       |   |   |           aBbzI3cxwlI168tztltTUQ==
|       |   |   |           3gczQP6mU996UfxRQDEjIQ==
|       |   |   |           op2XdN_2BqFeeCu986QRjQ==
|       |   |   |           2wm22p0GHapQXOz5qKgZFg==
|       |   |   |           mfLlVZW72uqgepOawvoRwA==
|       |   |   |           SQqeGWGkDZ6VBJZGXHGZRw==
|       |   |   |           HPI2AS_G1g859cuQbhdgdg==
|       |   |   |           Dmrs7CixMw5dtPRUqCqJGw==
|       |   |   |           E5Eh6EgAZw7gmPLYv6XMCg==
|       |   |   |           Rn4sqWcE1GI8ZpafPfUo2g==
|       |   |   |           dUPjyDwNI1AcTwaO6c1_rg==
|       |   |   |           YY2dtHiFuMMUDZzY+UdIHA==
|       |   |   |           O3qw5SkjAmXSDVBzKSOhtQ==
|       |   |   |           dwVRvDP+Kl7IZjKw8PZAKg==
|       |   |   |           +ekYqLhwEZ4AIduwM2bnAg==
|       |   |   |           3cdSVU9rVjvTPqLLl7UHkQ==
|       |   |   |           aUWzSVxytj1JZEluXPAuCg==
|       |   |   |           i9o+qQZljJGu+0RgpC86_Q==
|       |   |   |           xeDzqfj+1+s2RAvibq7hcQ==
|       |   |   |           mt715j40eHpLVTiSNZx_Gg==
|       |   |   |           IHOPviZTp0Vf8dOmNS_lBg==
|       |   |   |           1B9Aq2hiZsPDkkgpqp9ujA==
|       |   |   |           HKkjO5Mv+4gC4I+zTFeKYg==
|       |   |   |           amcJeZ5o1r2xoteBzXOzdQ==
|       |   |   |           Q301YqOEOZGlPx6whwTa9g==
|       |   |   |           4zAq7jvuQJO3OFG7Ujl_pA==
|       |   |   |           mzt24fuh6DrSYq+EPqVJkw==
|       |   |   |           Iz1ufHpp3x0hDONvBc20tA==
|       |   |   |           JRl_FgPUvxcsC_koLFumKw==
|       |   |   |           a_FX4Io9AiqtnIFqxGJJrg==
|       |   |   |           uhk3dUc6UDtsaOshqXX_2A==
|       |   |   |           c7xlJoRb3OLd5IDwCmw5KA==
|       |   |   |           uECdLcDwoHdPUKfJeQUckA==
|       |   |   |           48BaeKGNdJFL8d_MSSOubQ==
|       |   |   |           09ZUqEB9aVLR1vOz2hbp9Q==
|       |   |   |           BvKSQfk7D0OxHpVE9o6jbQ==
|       |   |   |           FpPuM8e5MlLSTtXh2xzDZA==
|       |   |   |           qtoS8t1LMSQK3iZhleJmYg==
|       |   |   |           n+P3BgLDFLYgJy1yiV6V5g==
|       |   |   |           zEnZU5+pnsOTFJV7AZdqqg==
|       |   |   |           _WMZKLWtGPr5yNJj5zAdUA==
|       |   |   |           R8QGYLzhagVwLjoZtXiqZw==
|       |   |   |           6y7OOdsB8lbYT9oxvywBIw==
|       |   |   |           B_5gRDYV+Qf00AWFQTAk2w==
|       |   |   |           ymlAnLcV+QbrEFB5yLGZ9A==
|       |   |   |           84zQK0_eeLI4EL62GWFp0A==
|       |   |   |           csON76dJ7Io64neQ1_0s0A==
|       |   |   |           F9vRgncYCze36f0k_2Q0gQ==
|       |   |   |           Lg6yNlz5O8A0WEu9L+iwMA==
|       |   |   |           CpRYwzVpZTxIS2tfS6qH7A==
|       |   |   |           Om1eNxJtJNXUwWtD2umtcQ==
|       |   |   |           N5S95mQuRBJ5PITka6oUhw==
|       |   |   |           pcs_WiAUZA06nOIpiLQhCQ==
|       |   |   |           9in5u5YomvAvNR_XxBJzmQ==
|       |   |   |           +9a5PCF0botXUxV+kdtCPg==
|       |   |   |           5XLD2ovJ5jmx2vOQSSSl3A==
|       |   |   |           XLmB4ZrGFrBOPG_+HXmbVQ==
|       |   |   |           ZJHmdLzB+NScEyRYQf9O8g==
|       |   |   |           jZyw2PmltTzj88b+th3p8g==
|       |   |   |           BfnDscqTvRuOGTrIhkPnfQ==
|       |   |   |           qyjse_lE9fQfbXOYMUR_jg==
|       |   |   |           hUX4sVPFuxrU2YQNNmQ9Rw==
|       |   |   |           0BEg7tXfWk7J6qmJxteOlQ==
|       |   |   |           AFt9w6WynlmYKLKDysnDhw==
|       |   |   |           qTHFqNcaC2FpghJ8dmXP2w==
|       |   |   |           zEMHVoNN1L+6zAC3C6h0Iw==
|       |   |   |           WF_x_SIb0M0JiAXYN2PszQ==
|       |   |   |           x+bDnEdLsnbIDump3MKXWA==
|       |   |   |           ZEpRNGAf2R34+Y9wSx_K7A==
|       |   |   |           A+wDflYxju_AuBiP59u3kQ==
|       |   |   |           kUoAu98Ts__XpR6BdT82ag==
|       |   |   |           pR+EaWqt47b71335+Wbt4Q==
|       |   |   |           V2fGJE9hq4qvXymxlvh5PQ==
|       |   |   |           8KKrY0I_fa8cAX_BU1qtHw==
|       |   |   |           4ikI+5QddN1HVse1TsCiKw==
|       |   |   |           zMUJWL6R4YT+LzpHt9c5Qg==
|       |   |   |           
|       |   |   +---release
|       |   |   |   +---packageReleaseResources
|       |   |   |   |   |   compile-file-map.properties
|       |   |   |   |   |   merger.xml
|       |   |   |   |   |   
|       |   |   |   |   +---merged.dir
|       |   |   |   |   |   \---values
|       |   |   |   |   |           values.xml
|       |   |   |   |   |           
|       |   |   |   |   \---stripped.dir
|       |   |   |   \---mergeReleaseResources
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
|       |   |   +---packageDebug
|       |   |   |   \---tmp
|       |   |   |       \---debug
|       |   |   |           |   dex-renamer-state.txt
|       |   |   |           |   
|       |   |   |           \---zip-cache
|       |   |   |                   javaResources0
|       |   |   |                   androidResources
|       |   |   |                   
|       |   |   +---mergeReleaseAssets
|       |   |   |       merger.xml
|       |   |   |       
|       |   |   +---release-mergeJavaRes
|       |   |   |   |   merge-state
|       |   |   |   |   
|       |   |   |   \---zip-cache
|       |   |   |           X889nVo4kC9u3+VZbkWvHA==
|       |   |   |           axTHiTQmXt3FdmNXELhXXw==
|       |   |   |           CojpzsrK_AfdWdtQS5HQqQ==
|       |   |   |           Orlza_j93fPLKWmBgD2plw==
|       |   |   |           beH3A0L5+a0bm1xnHHhIrQ==
|       |   |   |           EaYTXECIcVo3mF7aBVH_bQ==
|       |   |   |           Wca6kP4XzITz7HDkLblagQ==
|       |   |   |           hyej6tpsgPFmaFjVriotog==
|       |   |   |           q7WkEPmAB8ICuuz6WA3JSQ==
|       |   |   |           XURjxIt4IDfpirVtDqOoSQ==
|       |   |   |           nCSfKPflbfvHSeJvclARZQ==
|       |   |   |           2Yp2f2b25lnTV13qGEM7Zw==
|       |   |   |           w0JMOYiCg8zQORk0bUDl6g==
|       |   |   |           UAysUjLLzAESReFoMbb8Kw==
|       |   |   |           PypQnM+N20wYDoEBP2BPVw==
|       |   |   |           we8LN6C_H07jpWZzgRcmmA==
|       |   |   |           t2XobXj3LdWWhA07p5KyOg==
|       |   |   |           FTkVld9yuJpxDsrEIJp8hA==
|       |   |   |           GS3_tTzEMs6J974aXKNj4w==
|       |   |   |           qHg8GNlZ7KWAWxppejJ3ng==
|       |   |   |           5VzhvVfHGjuhe3+lxfKAEg==
|       |   |   |           unY_jbP+YosCmPvj4S+XyQ==
|       |   |   |           pLphjMSi7IjShPGf0XPMxA==
|       |   |   |           IaPh7ohUaklQPOkBhnu_lA==
|       |   |   |           ysfeAMHHcJwo9jCEVxaA6w==
|       |   |   |           BuYavRemrzRBvPDJ6DKy1A==
|       |   |   |           Dl2iF2xB0VUDNEypatXXdQ==
|       |   |   |           NYYzfLwBAcWWdVnmHzIWIA==
|       |   |   |           XUYPiLsbfidDdAWkocQuzw==
|       |   |   |           fVcXJW8R6YB3Vmm_ID4AMg==
|       |   |   |           qs3gWEYRgbbMozrD1QrwUA==
|       |   |   |           N9oTVhR4ZqT7JMCHF5SHjg==
|       |   |   |           vkHEHvEeY12VtvFh5smKQw==
|       |   |   |           Xyeod+vJOazeKv+k9_SMCA==
|       |   |   |           kMSZkCkC+hin+Ywttj+Lmg==
|       |   |   |           7QmvpAS6jtP1dfgYBkhlOw==
|       |   |   |           _BM3jK3gdzI8LVc102GDeg==
|       |   |   |           KFe_r_0dznU5wRGe87Y2aQ==
|       |   |   |           ahzaHyPa4aTT6Dsi3k3YFw==
|       |   |   |           2zlWz95sbmQ_JE6sNaLYNg==
|       |   |   |           3wih76BnEVGngoFyfIry0A==
|       |   |   |           5By6Ei2NGrBKYH1OD2GLNw==
|       |   |   |           1hf9gCG4rx6a5unwFCUwjw==
|       |   |   |           1iHrzaprqe7U7i9KCcP5ag==
|       |   |   |           XOW4oG1MITJ_LwnZ6C+GZQ==
|       |   |   |           GLq+z1MRYZDIOFJyLn0IIg==
|       |   |   |           jGLqg+TJ90wWGnz7RTakOQ==
|       |   |   |           e1XDAMwJSxXQoZ8BiMkLeA==
|       |   |   |           2f4tpv5Bcq3wmoq5ngs3AA==
|       |   |   |           CRGhA5hpjkmKtVmrpD2Rgg==
|       |   |   |           68pqhJ1zZJWbN60EL0IcSw==
|       |   |   |           Pfe5C1MGFbdr8Vd5RQKV_w==
|       |   |   |           qKi1DtQs0j_WNVKuWEHZKg==
|       |   |   |           H9_QsZXkt53m6vY+2FiKaA==
|       |   |   |           WSHwPRnnaL9euBaian1pmQ==
|       |   |   |           aBbzI3cxwlI168tztltTUQ==
|       |   |   |           3gczQP6mU996UfxRQDEjIQ==
|       |   |   |           op2XdN_2BqFeeCu986QRjQ==
|       |   |   |           2wm22p0GHapQXOz5qKgZFg==
|       |   |   |           mfLlVZW72uqgepOawvoRwA==
|       |   |   |           SQqeGWGkDZ6VBJZGXHGZRw==
|       |   |   |           Dmrs7CixMw5dtPRUqCqJGw==
|       |   |   |           E5Eh6EgAZw7gmPLYv6XMCg==
|       |   |   |           Rn4sqWcE1GI8ZpafPfUo2g==
|       |   |   |           dUPjyDwNI1AcTwaO6c1_rg==
|       |   |   |           YY2dtHiFuMMUDZzY+UdIHA==
|       |   |   |           O3qw5SkjAmXSDVBzKSOhtQ==
|       |   |   |           dwVRvDP+Kl7IZjKw8PZAKg==
|       |   |   |           HPI2AS_G1g859cuQbhdgdg==
|       |   |   |           +ekYqLhwEZ4AIduwM2bnAg==
|       |   |   |           3cdSVU9rVjvTPqLLl7UHkQ==
|       |   |   |           aUWzSVxytj1JZEluXPAuCg==
|       |   |   |           i9o+qQZljJGu+0RgpC86_Q==
|       |   |   |           xeDzqfj+1+s2RAvibq7hcQ==
|       |   |   |           mt715j40eHpLVTiSNZx_Gg==
|       |   |   |           IHOPviZTp0Vf8dOmNS_lBg==
|       |   |   |           1B9Aq2hiZsPDkkgpqp9ujA==
|       |   |   |           HKkjO5Mv+4gC4I+zTFeKYg==
|       |   |   |           amcJeZ5o1r2xoteBzXOzdQ==
|       |   |   |           Q301YqOEOZGlPx6whwTa9g==
|       |   |   |           4zAq7jvuQJO3OFG7Ujl_pA==
|       |   |   |           mzt24fuh6DrSYq+EPqVJkw==
|       |   |   |           Iz1ufHpp3x0hDONvBc20tA==
|       |   |   |           JRl_FgPUvxcsC_koLFumKw==
|       |   |   |           a_FX4Io9AiqtnIFqxGJJrg==
|       |   |   |           uhk3dUc6UDtsaOshqXX_2A==
|       |   |   |           c7xlJoRb3OLd5IDwCmw5KA==
|       |   |   |           uECdLcDwoHdPUKfJeQUckA==
|       |   |   |           48BaeKGNdJFL8d_MSSOubQ==
|       |   |   |           09ZUqEB9aVLR1vOz2hbp9Q==
|       |   |   |           BvKSQfk7D0OxHpVE9o6jbQ==
|       |   |   |           FpPuM8e5MlLSTtXh2xzDZA==
|       |   |   |           qtoS8t1LMSQK3iZhleJmYg==
|       |   |   |           n+P3BgLDFLYgJy1yiV6V5g==
|       |   |   |           zEnZU5+pnsOTFJV7AZdqqg==
|       |   |   |           _WMZKLWtGPr5yNJj5zAdUA==
|       |   |   |           R8QGYLzhagVwLjoZtXiqZw==
|       |   |   |           6y7OOdsB8lbYT9oxvywBIw==
|       |   |   |           B_5gRDYV+Qf00AWFQTAk2w==
|       |   |   |           ymlAnLcV+QbrEFB5yLGZ9A==
|       |   |   |           84zQK0_eeLI4EL62GWFp0A==
|       |   |   |           csON76dJ7Io64neQ1_0s0A==
|       |   |   |           F9vRgncYCze36f0k_2Q0gQ==
|       |   |   |           Lg6yNlz5O8A0WEu9L+iwMA==
|       |   |   |           CpRYwzVpZTxIS2tfS6qH7A==
|       |   |   |           Om1eNxJtJNXUwWtD2umtcQ==
|       |   |   |           N5S95mQuRBJ5PITka6oUhw==
|       |   |   |           pcs_WiAUZA06nOIpiLQhCQ==
|       |   |   |           9in5u5YomvAvNR_XxBJzmQ==
|       |   |   |           +9a5PCF0botXUxV+kdtCPg==
|       |   |   |           5XLD2ovJ5jmx2vOQSSSl3A==
|       |   |   |           XLmB4ZrGFrBOPG_+HXmbVQ==
|       |   |   |           ZJHmdLzB+NScEyRYQf9O8g==
|       |   |   |           jZyw2PmltTzj88b+th3p8g==
|       |   |   |           BfnDscqTvRuOGTrIhkPnfQ==
|       |   |   |           qyjse_lE9fQfbXOYMUR_jg==
|       |   |   |           hUX4sVPFuxrU2YQNNmQ9Rw==
|       |   |   |           0BEg7tXfWk7J6qmJxteOlQ==
|       |   |   |           AFt9w6WynlmYKLKDysnDhw==
|       |   |   |           qTHFqNcaC2FpghJ8dmXP2w==
|       |   |   |           zEMHVoNN1L+6zAC3C6h0Iw==
|       |   |   |           WF_x_SIb0M0JiAXYN2PszQ==
|       |   |   |           x+bDnEdLsnbIDump3MKXWA==
|       |   |   |           ZEpRNGAf2R34+Y9wSx_K7A==
|       |   |   |           A+wDflYxju_AuBiP59u3kQ==
|       |   |   |           kUoAu98Ts__XpR6BdT82ag==
|       |   |   |           pR+EaWqt47b71335+Wbt4Q==
|       |   |   |           V2fGJE9hq4qvXymxlvh5PQ==
|       |   |   |           8KKrY0I_fa8cAX_BU1qtHw==
|       |   |   |           4ikI+5QddN1HVse1TsCiKw==
|       |   |   |           zMUJWL6R4YT+LzpHt9c5Qg==
|       |   |   |           
|       |   |   +---lintVitalAnalyzeRelease
|       |   |   |       module.xml
|       |   |   |       release.xml
|       |   |   |       release-artifact-dependencies.xml
|       |   |   |       release-artifact-libraries.xml
|       |   |   |       
|       |   |   +---lintAnalyzeDebugAndroidTest
|       |   |   |       module.xml
|       |   |   |       debug.xml
|       |   |   |       debug-artifact-dependencies.xml
|       |   |   |       debug-artifact-libraries.xml
|       |   |   |       
|       |   |   +---lintAnalyzeDebug
|       |   |   |       module.xml
|       |   |   |       debug.xml
|       |   |   |       debug-artifact-dependencies.xml
|       |   |   |       debug-artifact-libraries.xml
|       |   |   |       
|       |   |   +---lintAnalyzeDebugUnitTest
|       |   |   |       module.xml
|       |   |   |       debug.xml
|       |   |   |       debug-artifact-dependencies.xml
|       |   |   |       debug-artifact-libraries.xml
|       |   |   |       
|       |   |   \---packageRelease
|       |   |       \---tmp
|       |   |           \---release
|       |   |               |   dex-renamer-state.txt
|       |   |               |   
|       |   |               \---zip-cache
|       |   |                       javaResources0
|       |   |                       androidResources
|       |   |                       
|       |   +---global_synthetics_dex
|       |   |   +---debug
|       |   |   |   \---generateDebugGlobalSynthetics
|       |   |   |           classes.dex
|       |   |   |           
|       |   |   \---release
|       |   |       \---mergeReleaseGlobalSynthetics
|       |   +---packaged_res
|       |   |   +---debug
|       |   |   |   \---packageDebugResources
|       |   |   |       +---values
|       |   |   |       |       values.xml
|       |   |   |       |       
|       |   |   |       +---mipmap-xxhdpi-v4
|       |   |   |       |       ic_launcher_round.webp
|       |   |   |       |       ic_launcher.webp
|       |   |   |       |       
|       |   |   |       +---mipmap-hdpi-v4
|       |   |   |       |       ic_launcher_round.webp
|       |   |   |       |       ic_launcher.webp
|       |   |   |       |       
|       |   |   |       +---mipmap-xxxhdpi-v4
|       |   |   |       |       ic_launcher_round.webp
|       |   |   |       |       ic_launcher.webp
|       |   |   |       |       
|       |   |   |       +---mipmap-xhdpi-v4
|       |   |   |       |       ic_launcher.webp
|       |   |   |       |       ic_launcher_round.webp
|       |   |   |       |       
|       |   |   |       +---mipmap-mdpi-v4
|       |   |   |       |       ic_launcher_round.webp
|       |   |   |       |       ic_launcher.webp
|       |   |   |       |       
|       |   |   |       +---drawable
|       |   |   |       |       ic_launcher_background.xml
|       |   |   |       |       ic_launcher_foreground.xml
|       |   |   |       |       
|       |   |   |       +---xml
|       |   |   |       |       backup_rules.xml
|       |   |   |       |       file_paths.xml
|       |   |   |       |       data_extraction_rules.xml
|       |   |   |       |       
|       |   |   |       \---mipmap-anydpi-v26
|       |   |   |               ic_launcher.xml
|       |   |   |               ic_launcher_round.xml
|       |   |   |               
|       |   |   \---release
|       |   |       \---packageReleaseResources
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
|       |   +---external_file_lib_dex_archives
|       |   |   +---debug
|       |   |   |   \---desugarDebugFileDependencies
|       |   |   \---release
|       |   |       \---desugarReleaseFileDependencies
|       |   +---global_synthetics_file_lib
|       |   |   +---debug
|       |   |   |   \---desugarDebugFileDependencies
|       |   |   \---release
|       |   |       \---desugarReleaseFileDependencies
|       |   +---aar_metadata_check
|       |   |   +---debug
|       |   |   |   \---checkDebugAarMetadata
|       |   |   \---release
|       |   |       \---checkReleaseAarMetadata
|       |   +---duplicate_classes_check
|       |   |   +---debug
|       |   |   |   \---checkDebugDuplicateClasses
|       |   |   \---release
|       |   |       \---checkReleaseDuplicateClasses
|       |   +---android_res_source_set_path_map
|       |   |   +---debug
|       |   |   |   \---mapDebugSourceSetPaths
|       |   |   |           file-map.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---mapReleaseSourceSetPaths
|       |   |               file-map.txt
|       |   |               
|       |   +---compiled_navigation_res
|       |   |   +---debug
|       |   |   |   \---compileDebugNavigationResources
|       |   |   \---release
|       |   |       \---compileReleaseNavigationResources
|       |   +---compressed_assets
|       |   |   +---debug
|       |   |   |   \---compressDebugAssets
|       |   |   |       \---out
|       |   |   |           \---assets
|       |   |   |               +---mlkit-google-ocr-models
|       |   |   |               |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine.binarypb.jar
|       |   |   |               |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine_ti.binarypb.jar
|       |   |   |               |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_recognizer.binarypb.jar
|       |   |   |               |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner.binarypb.jar
|       |   |   |               |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner_ti.binarypb.jar
|       |   |   |               |   |   
|       |   |   |               |   +---aksara
|       |   |   |               |   |       aksara_page_layout_analysis_ti_rpn_gcn.binarypb.jar
|       |   |   |               |   |       aksara_page_layout_analysis_rpn_gcn.binarypb.jar
|       |   |   |               |   |       
|       |   |   |               |   +---gocr
|       |   |   |               |   |   +---gocr_models
|       |   |   |               |   |   |   \---line_recognition_legacy_mobile
|       |   |   |               |   |   |       |   Latn_ctc_cpu.binarypb.jar
|       |   |   |               |   |   |       |   tflite_langid.tflite.jar
|       |   |   |               |   |   |       |   
|       |   |   |               |   |   |       \---Latn_ctc
|       |   |   |               |   |   |           \---optical
|       |   |   |               |   |   |               |   lstm_model.fb.jar
|       |   |   |               |   |   |               |   conv_model.fb.jar
|       |   |   |               |   |   |               |   
|       |   |   |               |   |   |               \---assets.extra
|       |   |   |               |   |   |                       LabelMap.pb.jar
|       |   |   |               |   |   |                       
|       |   |   |               |   |   \---layout
|       |   |   |               |   |       +---line_clustering_custom_ops
|       |   |   |               |   |       |       model.tflite.jar
|       |   |   |               |   |       |       
|       |   |   |               |   |       \---line_splitting_custom_ops
|       |   |   |               |   |               model.tflite.jar
|       |   |   |               |   |               
|       |   |   |               |   \---taser
|       |   |   |               |       |   rpn_text_detection_tflite_mobile_mbv2.binarypb.jar
|       |   |   |               |       |   taser_script_identification_tflite_mobile.binarypb.jar
|       |   |   |               |       |   
|       |   |   |               |       +---detector
|       |   |   |               |       |       region_proposal_text_detector_tflite_vertical_mbv2_v1.bincfg.jar
|       |   |   |               |       |       rpn_text_detector_mobile_space_to_depth_quantized_mbv2_v1.tflite.jar
|       |   |   |               |       |       
|       |   |   |               |       \---segmenter
|       |   |   |               |               tflite_script_detector_0.3.bincfg.jar
|       |   |   |               |               tflite_script_detector_0.3.conv_model.jar
|       |   |   |               |               tflite_script_detector_0.3.lstm_model.jar
|       |   |   |               |               
|       |   |   |               \---mlkit_barcode_models
|       |   |   |                       barcode_ssd_mobilenet_v1_dmp25_quant.tflite.jar
|       |   |   |                       oned_auto_regressor_mobile.tflite.jar
|       |   |   |                       oned_feature_extractor_mobile.tflite.jar
|       |   |   |                       
|       |   |   \---release
|       |   |       \---compressReleaseAssets
|       |   |           \---out
|       |   |               \---assets
|       |   |                   +---mlkit-google-ocr-models
|       |   |                   |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine.binarypb.jar
|       |   |                   |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_recognizer.binarypb.jar
|       |   |                   |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_engine_ti.binarypb.jar
|       |   |                   |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner.binarypb.jar
|       |   |                   |   |   taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile_runner_ti.binarypb.jar
|       |   |                   |   |   
|       |   |                   |   +---aksara
|       |   |                   |   |       aksara_page_layout_analysis_rpn_gcn.binarypb.jar
|       |   |                   |   |       aksara_page_layout_analysis_ti_rpn_gcn.binarypb.jar
|       |   |                   |   |       
|       |   |                   |   +---gocr
|       |   |                   |   |   +---gocr_models
|       |   |                   |   |   |   \---line_recognition_legacy_mobile
|       |   |                   |   |   |       |   Latn_ctc_cpu.binarypb.jar
|       |   |                   |   |   |       |   tflite_langid.tflite.jar
|       |   |                   |   |   |       |   
|       |   |                   |   |   |       \---Latn_ctc
|       |   |                   |   |   |           \---optical
|       |   |                   |   |   |               |   conv_model.fb.jar
|       |   |                   |   |   |               |   lstm_model.fb.jar
|       |   |                   |   |   |               |   
|       |   |                   |   |   |               \---assets.extra
|       |   |                   |   |   |                       LabelMap.pb.jar
|       |   |                   |   |   |                       
|       |   |                   |   |   \---layout
|       |   |                   |   |       +---line_clustering_custom_ops
|       |   |                   |   |       |       model.tflite.jar
|       |   |                   |   |       |       
|       |   |                   |   |       \---line_splitting_custom_ops
|       |   |                   |   |               model.tflite.jar
|       |   |                   |   |               
|       |   |                   |   \---taser
|       |   |                   |       |   rpn_text_detection_tflite_mobile_mbv2.binarypb.jar
|       |   |                   |       |   taser_script_identification_tflite_mobile.binarypb.jar
|       |   |                   |       |   
|       |   |                   |       +---detector
|       |   |                   |       |       rpn_text_detector_mobile_space_to_depth_quantized_mbv2_v1.tflite.jar
|       |   |                   |       |       region_proposal_text_detector_tflite_vertical_mbv2_v1.bincfg.jar
|       |   |                   |       |       
|       |   |                   |       \---segmenter
|       |   |                   |               tflite_script_detector_0.3.bincfg.jar
|       |   |                   |               tflite_script_detector_0.3.conv_model.jar
|       |   |                   |               tflite_script_detector_0.3.lstm_model.jar
|       |   |                   |               
|       |   |                   \---mlkit_barcode_models
|       |   |                           barcode_ssd_mobilenet_v1_dmp25_quant.tflite.jar
|       |   |                           oned_auto_regressor_mobile.tflite.jar
|       |   |                           oned_feature_extractor_mobile.tflite.jar
|       |   |                           
|       |   +---merged_res_blame_folder
|       |   |   +---debug
|       |   |   |   \---mergeDebugResources
|       |   |   |       \---out
|       |   |   |           +---multi-v2
|       |   |   |           |       values-pl.json
|       |   |   |           |       values-sk.json
|       |   |   |           |       values-zh-rCN.json
|       |   |   |           |       values-ka.json
|       |   |   |           |       values-large-v4.json
|       |   |   |           |       values-land.json
|       |   |   |           |       values-kn.json
|       |   |   |           |       values-de.json
|       |   |   |           |       values-be.json
|       |   |   |           |       values-nl.json
|       |   |   |           |       values-pt-rPT.json
|       |   |   |           |       values-ar.json
|       |   |   |           |       values-b+sr+Latn.json
|       |   |   |           |       values-km.json
|       |   |   |           |       values-sr.json
|       |   |   |           |       mergeDebugResources.json
|       |   |   |           |       values-sl.json
|       |   |   |           |       values-kk.json
|       |   |   |           |       values-af.json
|       |   |   |           |       values-bs.json
|       |   |   |           |       values.json
|       |   |   |           |       values-v17.json
|       |   |   |           |       values-xlarge-v4.json
|       |   |   |           |       values-vi.json
|       |   |   |           |       values-ru.json
|       |   |   |           |       values-my.json
|       |   |   |           |       values-lt.json
|       |   |   |           |       values-v21.json
|       |   |   |           |       values-it.json
|       |   |   |           |       values-night-v8.json
|       |   |   |           |       values-is.json
|       |   |   |           |       values-te.json
|       |   |   |           |       values-fr.json
|       |   |   |           |       values-fa.json
|       |   |   |           |       values-v22.json
|       |   |   |           |       values-or.json
|       |   |   |           |       values-in.json
|       |   |   |           |       values-hi.json
|       |   |   |           |       values-hu.json
|       |   |   |           |       values-eu.json
|       |   |   |           |       values-port.json
|       |   |   |           |       values-lv.json
|       |   |   |           |       values-gl.json
|       |   |   |           |       values-el.json
|       |   |   |           |       values-sq.json
|       |   |   |           |       values-ro.json
|       |   |   |           |       values-hy.json
|       |   |   |           |       values-v16.json
|       |   |   |           |       values-en-rAU.json
|       |   |   |           |       values-zu.json
|       |   |   |           |       values-v23.json
|       |   |   |           |       values-as.json
|       |   |   |           |       values-gu.json
|       |   |   |           |       values-v31.json
|       |   |   |           |       values-watch-v20.json
|       |   |   |           |       values-v24.json
|       |   |   |           |       values-zh-rHK.json
|       |   |   |           |       values-mr.json
|       |   |   |           |       values-pa.json
|       |   |   |           |       values-es-rUS.json
|       |   |   |           |       values-az.json
|       |   |   |           |       values-v30.json
|       |   |   |           |       values-ldltr-v21.json
|       |   |   |           |       values-zh-rTW.json
|       |   |   |           |       values-ky.json
|       |   |   |           |       values-ca.json
|       |   |   |           |       values-hdpi-v4.json
|       |   |   |           |       values-ur.json
|       |   |   |           |       values-et.json
|       |   |   |           |       values-pt.json
|       |   |   |           |       values-h720dp-v13.json
|       |   |   |           |       values-ja.json
|       |   |   |           |       values-watch-v21.json
|       |   |   |           |       values-v25.json
|       |   |   |           |       values-th.json
|       |   |   |           |       values-en-rXC.json
|       |   |   |           |       values-sw600dp-v13.json
|       |   |   |           |       values-cs.json
|       |   |   |           |       values-hr.json
|       |   |   |           |       values-ko.json
|       |   |   |           |       values-ml.json
|       |   |   |           |       values-bn.json
|       |   |   |           |       values-iw.json
|       |   |   |           |       values-night-v31.json
|       |   |   |           |       values-v18.json
|       |   |   |           |       values-sv.json
|       |   |   |           |       values-en-rGB.json
|       |   |   |           |       values-pt-rBR.json
|       |   |   |           |       values-ta.json
|       |   |   |           |       values-da.json
|       |   |   |           |       values-v26.json
|       |   |   |           |       values-tl.json
|       |   |   |           |       values-ms.json
|       |   |   |           |       values-mk.json
|       |   |   |           |       values-uz.json
|       |   |   |           |       values-tr.json
|       |   |   |           |       values-en-rCA.json
|       |   |   |           |       values-nb.json
|       |   |   |           |       values-ne.json
|       |   |   |           |       values-en-rIN.json
|       |   |   |           |       values-v28.json
|       |   |   |           |       values-es.json
|       |   |   |           |       values-lo.json
|       |   |   |           |       values-fi.json
|       |   |   |           |       values-fr-rCA.json
|       |   |   |           |       values-mn.json
|       |   |   |           |       values-bg.json
|       |   |   |           |       values-sw.json
|       |   |   |           |       values-si.json
|       |   |   |           |       values-am.json
|       |   |   |           |       values-uk.json
|       |   |   |           |       
|       |   |   |           \---single
|       |   |   |                   mergeDebugResources.json
|       |   |   |                   
|       |   |   \---release
|       |   |       \---mergeReleaseResources
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
|       |   |               |       mergeReleaseResources.json
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
|       |   |                       mergeReleaseResources.json
|       |   |                       
|       |   +---data_binding_layout_info_type_merge
|       |   |   +---debug
|       |   |   |   \---mergeDebugResources
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---mergeReleaseResources
|       |   |           \---out
|       |   +---merged_res
|       |   |   +---debug
|       |   |   |   \---mergeDebugResources
|       |   |   |           values_values.arsc.flat
|       |   |   |           values-watch-v20_values-watch-v20.arsc.flat
|       |   |   |           values-v16_values-v16.arsc.flat
|       |   |   |           values-af_values-af.arsc.flat
|       |   |   |           values-it_values-it.arsc.flat
|       |   |   |           values-ar_values-ar.arsc.flat
|       |   |   |           values-hi_values-hi.arsc.flat
|       |   |   |           values-v23_values-v23.arsc.flat
|       |   |   |           values-hr_values-hr.arsc.flat
|       |   |   |           values-az_values-az.arsc.flat
|       |   |   |           values-v18_values-v18.arsc.flat
|       |   |   |           values-v26_values-v26.arsc.flat
|       |   |   |           values-in_values-in.arsc.flat
|       |   |   |           values-be_values-be.arsc.flat
|       |   |   |           values-am_values-am.arsc.flat
|       |   |   |           values-bn_values-bn.arsc.flat
|       |   |   |           values-as_values-as.arsc.flat
|       |   |   |           values-v31_values-v31.arsc.flat
|       |   |   |           values-ja_values-ja.arsc.flat
|       |   |   |           values-sl_values-sl.arsc.flat
|       |   |   |           values-v24_values-v24.arsc.flat
|       |   |   |           values-kk_values-kk.arsc.flat
|       |   |   |           values-ro_values-ro.arsc.flat
|       |   |   |           values-ko_values-ko.arsc.flat
|       |   |   |           values-ru_values-ru.arsc.flat
|       |   |   |           values-pt-rBR_values-pt-rBR.arsc.flat
|       |   |   |           values-en-rCA_values-en-rCA.arsc.flat
|       |   |   |           values-th_values-th.arsc.flat
|       |   |   |           values-ka_values-ka.arsc.flat
|       |   |   |           values-tr_values-tr.arsc.flat
|       |   |   |           values-sq_values-sq.arsc.flat
|       |   |   |           values-lt_values-lt.arsc.flat
|       |   |   |           values-km_values-km.arsc.flat
|       |   |   |           values-ur_values-ur.arsc.flat
|       |   |   |           values-sw_values-sw.arsc.flat
|       |   |   |           values-uz_values-uz.arsc.flat
|       |   |   |           values-cs_values-cs.arsc.flat
|       |   |   |           values-el_values-el.arsc.flat
|       |   |   |           values-tl_values-tl.arsc.flat
|       |   |   |           values-et_values-et.arsc.flat
|       |   |   |           values-en-rAU_values-en-rAU.arsc.flat
|       |   |   |           values-port_values-port.arsc.flat
|       |   |   |           values-lv_values-lv.arsc.flat
|       |   |   |           values-nl_values-nl.arsc.flat
|       |   |   |           values-mk_values-mk.arsc.flat
|       |   |   |           values-fr_values-fr.arsc.flat
|       |   |   |           values-fr-rCA_values-fr-rCA.arsc.flat
|       |   |   |           values-land_values-land.arsc.flat
|       |   |   |           values-zh-rTW_values-zh-rTW.arsc.flat
|       |   |   |           values-pa_values-pa.arsc.flat
|       |   |   |           values-eu_values-eu.arsc.flat
|       |   |   |           drawable_ic_launcher_background.xml.flat
|       |   |   |           values-night-v8_values-night-v8.arsc.flat
|       |   |   |           xml_data_extraction_rules.xml.flat
|       |   |   |           mipmap-xhdpi_ic_launcher_round.webp.flat
|       |   |   |           values-zh-rCN_values-zh-rCN.arsc.flat
|       |   |   |           xml_backup_rules.xml.flat
|       |   |   |           values-large-v4_values-large-v4.arsc.flat
|       |   |   |           values-pt_values-pt.arsc.flat
|       |   |   |           values-or_values-or.arsc.flat
|       |   |   |           values-hu_values-hu.arsc.flat
|       |   |   |           values-pl_values-pl.arsc.flat
|       |   |   |           values-v17_values-v17.arsc.flat
|       |   |   |           mipmap-xxhdpi_ic_launcher.webp.flat
|       |   |   |           mipmap-anydpi-v26_ic_launcher_round.xml.flat
|       |   |   |           values-zh-rHK_values-zh-rHK.arsc.flat
|       |   |   |           mipmap-xhdpi_ic_launcher.webp.flat
|       |   |   |           values-iw_values-iw.arsc.flat
|       |   |   |           mipmap-xxhdpi_ic_launcher_round.webp.flat
|       |   |   |           values-v21_values-v21.arsc.flat
|       |   |   |           values-watch-v21_values-watch-v21.arsc.flat
|       |   |   |           values-v22_values-v22.arsc.flat
|       |   |   |           values-hy_values-hy.arsc.flat
|       |   |   |           values-pt-rPT_values-pt-rPT.arsc.flat
|       |   |   |           values-ldltr-v21_values-ldltr-v21.arsc.flat
|       |   |   |           values-v28_values-v28.arsc.flat
|       |   |   |           values-is_values-is.arsc.flat
|       |   |   |           values-bg_values-bg.arsc.flat
|       |   |   |           values-b+sr+Latn_values-b+sr+Latn.arsc.flat
|       |   |   |           values-bs_values-bs.arsc.flat
|       |   |   |           values-es-rUS_values-es-rUS.arsc.flat
|       |   |   |           values-si_values-si.arsc.flat
|       |   |   |           values-v25_values-v25.arsc.flat
|       |   |   |           values-ca_values-ca.arsc.flat
|       |   |   |           values-zu_values-zu.arsc.flat
|       |   |   |           values-kn_values-kn.arsc.flat
|       |   |   |           values-sw600dp-v13_values-sw600dp-v13.arsc.flat
|       |   |   |           values-ta_values-ta.arsc.flat
|       |   |   |           values-night-v31_values-night-v31.arsc.flat
|       |   |   |           values-h720dp-v13_values-h720dp-v13.arsc.flat
|       |   |   |           values-v30_values-v30.arsc.flat
|       |   |   |           values-xlarge-v4_values-xlarge-v4.arsc.flat
|       |   |   |           values-sk_values-sk.arsc.flat
|       |   |   |           values-de_values-de.arsc.flat
|       |   |   |           values-sr_values-sr.arsc.flat
|       |   |   |           values-en-rIN_values-en-rIN.arsc.flat
|       |   |   |           values-sv_values-sv.arsc.flat
|       |   |   |           values-ml_values-ml.arsc.flat
|       |   |   |           values-ky_values-ky.arsc.flat
|       |   |   |           values-mr_values-mr.arsc.flat
|       |   |   |           values-te_values-te.arsc.flat
|       |   |   |           values-my_values-my.arsc.flat
|       |   |   |           values-da_values-da.arsc.flat
|       |   |   |           values-vi_values-vi.arsc.flat
|       |   |   |           values-lo_values-lo.arsc.flat
|       |   |   |           values-ne_values-ne.arsc.flat
|       |   |   |           values-uk_values-uk.arsc.flat
|       |   |   |           values-fi_values-fi.arsc.flat
|       |   |   |           values-mn_values-mn.arsc.flat
|       |   |   |           values-hdpi-v4_values-hdpi-v4.arsc.flat
|       |   |   |           values-ms_values-ms.arsc.flat
|       |   |   |           values-gl_values-gl.arsc.flat
|       |   |   |           values-es_values-es.arsc.flat
|       |   |   |           mipmap-mdpi_ic_launcher.webp.flat
|       |   |   |           values-nb_values-nb.arsc.flat
|       |   |   |           mipmap-mdpi_ic_launcher_round.webp.flat
|       |   |   |           xml_file_paths.xml.flat
|       |   |   |           values-fa_values-fa.arsc.flat
|       |   |   |           mipmap-hdpi_ic_launcher_round.webp.flat
|       |   |   |           mipmap-xxxhdpi_ic_launcher_round.webp.flat
|       |   |   |           values-en-rXC_values-en-rXC.arsc.flat
|       |   |   |           values-en-rGB_values-en-rGB.arsc.flat
|       |   |   |           values-gu_values-gu.arsc.flat
|       |   |   |           drawable_ic_launcher_foreground.xml.flat
|       |   |   |           mipmap-xxxhdpi_ic_launcher.webp.flat
|       |   |   |           mipmap-anydpi-v26_ic_launcher.xml.flat
|       |   |   |           mipmap-hdpi_ic_launcher.webp.flat
|       |   |   |           
|       |   |   \---release
|       |   |       \---mergeReleaseResources
|       |   |               values_values.arsc.flat
|       |   |               values-watch-v20_values-watch-v20.arsc.flat
|       |   |               values-v16_values-v16.arsc.flat
|       |   |               values-af_values-af.arsc.flat
|       |   |               values-it_values-it.arsc.flat
|       |   |               values-ar_values-ar.arsc.flat
|       |   |               values-v23_values-v23.arsc.flat
|       |   |               values-az_values-az.arsc.flat
|       |   |               values-v26_values-v26.arsc.flat
|       |   |               values-be_values-be.arsc.flat
|       |   |               values-bn_values-bn.arsc.flat
|       |   |               values-ka_values-ka.arsc.flat
|       |   |               values-sq_values-sq.arsc.flat
|       |   |               values-km_values-km.arsc.flat
|       |   |               values-sw_values-sw.arsc.flat
|       |   |               values-cs_values-cs.arsc.flat
|       |   |               values-tl_values-tl.arsc.flat
|       |   |               values-en-rAU_values-en-rAU.arsc.flat
|       |   |               values-lv_values-lv.arsc.flat
|       |   |               values-mk_values-mk.arsc.flat
|       |   |               values-fr-rCA_values-fr-rCA.arsc.flat
|       |   |               values-zh-rTW_values-zh-rTW.arsc.flat
|       |   |               values-eu_values-eu.arsc.flat
|       |   |               values-night-v8_values-night-v8.arsc.flat
|       |   |               values-zh-rCN_values-zh-rCN.arsc.flat
|       |   |               values-large-v4_values-large-v4.arsc.flat
|       |   |               values-or_values-or.arsc.flat
|       |   |               values-pl_values-pl.arsc.flat
|       |   |               mipmap-xxhdpi_ic_launcher.webp.flat
|       |   |               mipmap-anydpi-v26_ic_launcher_round.xml.flat
|       |   |               mipmap-xhdpi_ic_launcher.webp.flat
|       |   |               mipmap-xxhdpi_ic_launcher_round.webp.flat
|       |   |               values-hi_values-hi.arsc.flat
|       |   |               values-hr_values-hr.arsc.flat
|       |   |               values-v18_values-v18.arsc.flat
|       |   |               values-in_values-in.arsc.flat
|       |   |               values-am_values-am.arsc.flat
|       |   |               values-as_values-as.arsc.flat
|       |   |               values-ja_values-ja.arsc.flat
|       |   |               values-v24_values-v24.arsc.flat
|       |   |               values-ro_values-ro.arsc.flat
|       |   |               values-ru_values-ru.arsc.flat
|       |   |               values-en-rCA_values-en-rCA.arsc.flat
|       |   |               values-si_values-si.arsc.flat
|       |   |               values-ca_values-ca.arsc.flat
|       |   |               values-kn_values-kn.arsc.flat
|       |   |               values-ta_values-ta.arsc.flat
|       |   |               values-h720dp-v13_values-h720dp-v13.arsc.flat
|       |   |               values-xlarge-v4_values-xlarge-v4.arsc.flat
|       |   |               values-de_values-de.arsc.flat
|       |   |               values-en-rIN_values-en-rIN.arsc.flat
|       |   |               values-ml_values-ml.arsc.flat
|       |   |               values-mr_values-mr.arsc.flat
|       |   |               values-my_values-my.arsc.flat
|       |   |               values-vi_values-vi.arsc.flat
|       |   |               values-ne_values-ne.arsc.flat
|       |   |               values-fi_values-fi.arsc.flat
|       |   |               values-hdpi-v4_values-hdpi-v4.arsc.flat
|       |   |               values-gl_values-gl.arsc.flat
|       |   |               mipmap-mdpi_ic_launcher.webp.flat
|       |   |               mipmap-mdpi_ic_launcher_round.webp.flat
|       |   |               xml_file_paths.xml.flat
|       |   |               mipmap-hdpi_ic_launcher_round.webp.flat
|       |   |               mipmap-xxxhdpi_ic_launcher_round.webp.flat
|       |   |               values-pt_values-pt.arsc.flat
|       |   |               values-hu_values-hu.arsc.flat
|       |   |               values-v17_values-v17.arsc.flat
|       |   |               values-zh-rHK_values-zh-rHK.arsc.flat
|       |   |               values-iw_values-iw.arsc.flat
|       |   |               values-v21_values-v21.arsc.flat
|       |   |               values-v22_values-v22.arsc.flat
|       |   |               values-pt-rPT_values-pt-rPT.arsc.flat
|       |   |               values-v28_values-v28.arsc.flat
|       |   |               values-bg_values-bg.arsc.flat
|       |   |               values-bs_values-bs.arsc.flat
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
|       |   |               values-watch-v21_values-watch-v21.arsc.flat
|       |   |               values-hy_values-hy.arsc.flat
|       |   |               values-ldltr-v21_values-ldltr-v21.arsc.flat
|       |   |               values-is_values-is.arsc.flat
|       |   |               values-b+sr+Latn_values-b+sr+Latn.arsc.flat
|       |   |               values-es-rUS_values-es-rUS.arsc.flat
|       |   |               values-v25_values-v25.arsc.flat
|       |   |               values-zu_values-zu.arsc.flat
|       |   |               values-sw600dp-v13_values-sw600dp-v13.arsc.flat
|       |   |               values-night-v31_values-night-v31.arsc.flat
|       |   |               values-v31_values-v31.arsc.flat
|       |   |               values-sl_values-sl.arsc.flat
|       |   |               values-kk_values-kk.arsc.flat
|       |   |               values-ko_values-ko.arsc.flat
|       |   |               values-pt-rBR_values-pt-rBR.arsc.flat
|       |   |               values-th_values-th.arsc.flat
|       |   |               values-tr_values-tr.arsc.flat
|       |   |               values-lt_values-lt.arsc.flat
|       |   |               values-ur_values-ur.arsc.flat
|       |   |               values-uz_values-uz.arsc.flat
|       |   |               values-el_values-el.arsc.flat
|       |   |               values-et_values-et.arsc.flat
|       |   |               values-port_values-port.arsc.flat
|       |   |               values-nl_values-nl.arsc.flat
|       |   |               values-fr_values-fr.arsc.flat
|       |   |               values-land_values-land.arsc.flat
|       |   |               values-pa_values-pa.arsc.flat
|       |   |               drawable_ic_launcher_background.xml.flat
|       |   |               xml_data_extraction_rules.xml.flat
|       |   |               mipmap-xhdpi_ic_launcher_round.webp.flat
|       |   |               xml_backup_rules.xml.flat
|       |   |               
|       |   +---local_only_symbol_list
|       |   |   +---debug
|       |   |   |   \---parseDebugLocalResources
|       |   |   |           R-def.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---parseReleaseLocalResources
|       |   |               R-def.txt
|       |   |               
|       |   +---compile_r_class_jar
|       |   |   +---debug
|       |   |   |   \---generateDebugRFile
|       |   |   |           R.jar
|       |   |   |           
|       |   |   \---release
|       |   |       \---generateReleaseRFile
|       |   |               R.jar
|       |   |               
|       |   +---symbol_list_with_package_name
|       |   |   +---debug
|       |   |   |   \---generateDebugRFile
|       |   |   |           package-aware-r.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---generateReleaseRFile
|       |   |               package-aware-r.txt
|       |   |               
|       |   +---compile_symbol_list
|       |   |   +---debug
|       |   |   |   \---generateDebugRFile
|       |   |   |           R.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---generateReleaseRFile
|       |   |               R.txt
|       |   |               
|       |   +---dex
|       |   |   +---debug
|       |   |   |   +---mergeLibDexDebug
|       |   |   |   |   +---0
|       |   |   |   |   +---1
|       |   |   |   |   +---2
|       |   |   |   |   +---3
|       |   |   |   |   +---4
|       |   |   |   |   +---5
|       |   |   |   |   +---6
|       |   |   |   |   +---7
|       |   |   |   |   +---8
|       |   |   |   |   +---9
|       |   |   |   |   +---10
|       |   |   |   |   +---11
|       |   |   |   |   +---12
|       |   |   |   |   +---13
|       |   |   |   |   +---14
|       |   |   |   |   \---15
|       |   |   |   +---mergeExtDexDebug
|       |   |   |   |       classes3.dex
|       |   |   |   |       classes2.dex
|       |   |   |   |       classes.dex
|       |   |   |   |       
|       |   |   |   \---mergeProjectDexDebug
|       |   |   |       +---0
|       |   |   |       |       classes.dex
|       |   |   |       |       
|       |   |   |       +---1
|       |   |   |       |       classes.dex
|       |   |   |       |       
|       |   |   |       +---2
|       |   |   |       |       classes.dex
|       |   |   |       |       
|       |   |   |       +---3
|       |   |   |       +---4
|       |   |   |       +---5
|       |   |   |       +---6
|       |   |   |       +---7
|       |   |   |       +---8
|       |   |   |       +---9
|       |   |   |       +---10
|       |   |   |       +---11
|       |   |   |       +---12
|       |   |   |       +---13
|       |   |   |       +---14
|       |   |   |       \---15
|       |   |   \---release
|       |   |       \---mergeDexRelease
|       |   |               classes3.dex
|       |   |               classes2.dex
|       |   |               classes.dex
|       |   |               
|       |   +---compatible_screen_manifest
|       |   |   +---debug
|       |   |   |   \---createDebugCompatibleScreenManifests
|       |   |   |           output-metadata.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---createReleaseCompatibleScreenManifests
|       |   |               output-metadata.json
|       |   |               
|       |   +---navigation_json
|       |   |   +---debug
|       |   |   |   \---extractDeepLinksDebug
|       |   |   |           navigation.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---extractDeepLinksRelease
|       |   |               navigation.json
|       |   |               
|       |   +---built_in_kotlinc
|       |   |   +---debug
|       |   |   |   \---compileDebugKotlin
|       |   |   |       \---classes
|       |   |   |           +---com
|       |   |   |           |   \---example
|       |   |   |           |       \---ohrana
|       |   |   |           |           |   ComposableSingletons$AdministratorScreenKt.class
|       |   |   |           |           |   AdministratorScreenKt.class
|       |   |   |           |           |   Employee.class
|       |   |   |           |           |   ComposableSingletons$EmployeeListScreenKt.class
|       |   |   |           |           |   EmployeeListScreenKt.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.class
|       |   |   |           |           |   ComposableSingletons$OhrannikScreenKt.class
|       |   |   |           |           |   OhrannikScreenKt.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.class
|       |   |   |           |           |   ComposableSingletons$PrivetScreenKt.class
|       |   |   |           |           |   PrivetScreenKt.class
|       |   |   |           |           |   ComposableSingletons$SpisokOtchetovKt.class
|       |   |   |           |           |   SpisokOtchetovKt.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$1.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$2.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$3.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$4.class
|       |   |   |           |           |   QrResult.class
|       |   |   |           |           |   QrResult$QuestionFormat.class
|       |   |   |           |           |   QrResult$InputFormat.class
|       |   |   |           |           |   QrResult$LocationCheckpoint.class
|       |   |   |           |           |   QrResult$ShiftReportTrigger.class
|       |   |   |           |           |   QrResult$Error.class
|       |   |   |           |           |   CheckpointEntry.class
|       |   |   |           |           |   QrHandler.class
|       |   |   |           |           |   MainActivity.class
|       |   |   |           |           |   ComposableSingletons$MainActivityKt.class
|       |   |   |           |           |   MainActivityKt.class
|       |   |   |           |           |   QrScanRecord.class
|       |   |   |           |           |   SharedPrefsManager.class
|       |   |   |           |           |   ComposableSingletons$OhrannikCabinetScreenKt.class
|       |   |   |           |           |   OhrannikCabinetScreenKt.class
|       |   |   |           |           |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.class
|       |   |   |           |           |   
|       |   |   |           |           \---ui
|       |   |   |           |               \---theme
|       |   |   |           |                       ColorKt.class
|       |   |   |           |                       ThemeKt.class
|       |   |   |           |                       TypeKt.class
|       |   |   |           |                       
|       |   |   |           \---META-INF
|       |   |   |                   app.kotlin_module
|       |   |   |                   
|       |   |   +---release
|       |   |   |   \---compileReleaseKotlin
|       |   |   |       \---classes
|       |   |   |           +---com
|       |   |   |           |   \---example
|       |   |   |           |       \---ohrana
|       |   |   |           |           |   ComposableSingletons$AdministratorScreenKt.class
|       |   |   |           |           |   AdministratorScreenKt.class
|       |   |   |           |           |   Employee.class
|       |   |   |           |           |   ComposableSingletons$EmployeeListScreenKt.class
|       |   |   |           |           |   EmployeeListScreenKt.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.class
|       |   |   |           |           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.class
|       |   |   |           |           |   MainActivity.class
|       |   |   |           |           |   ComposableSingletons$MainActivityKt.class
|       |   |   |           |           |   MainActivityKt.class
|       |   |   |           |           |   ComposableSingletons$OhrannikCabinetScreenKt.class
|       |   |   |           |           |   OhrannikCabinetScreenKt.class
|       |   |   |           |           |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.class
|       |   |   |           |           |   ComposableSingletons$OhrannikScreenKt.class
|       |   |   |           |           |   OhrannikScreenKt.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.class
|       |   |   |           |           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.class
|       |   |   |           |           |   ComposableSingletons$PrivetScreenKt.class
|       |   |   |           |           |   PrivetScreenKt.class
|       |   |   |           |           |   QrResult.class
|       |   |   |           |           |   QrResult$QuestionFormat.class
|       |   |   |           |           |   QrResult$InputFormat.class
|       |   |   |           |           |   QrResult$LocationCheckpoint.class
|       |   |   |           |           |   QrResult$ShiftReportTrigger.class
|       |   |   |           |           |   QrResult$Error.class
|       |   |   |           |           |   CheckpointEntry.class
|       |   |   |           |           |   QrHandler.class
|       |   |   |           |           |   QrScanRecord.class
|       |   |   |           |           |   SharedPrefsManager.class
|       |   |   |           |           |   ComposableSingletons$SpisokOtchetovKt.class
|       |   |   |           |           |   SpisokOtchetovKt.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$1.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$2.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$3.class
|       |   |   |           |           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$4.class
|       |   |   |           |           |   
|       |   |   |           |           \---ui
|       |   |   |           |               \---theme
|       |   |   |           |                       ColorKt.class
|       |   |   |           |                       ThemeKt.class
|       |   |   |           |                       TypeKt.class
|       |   |   |           |                       
|       |   |   |           \---META-INF
|       |   |   |                   app.kotlin_module
|       |   |   |                   
|       |   |   \---debugUnitTest
|       |   |       \---compileDebugUnitTestKotlin
|       |   |           \---classes
|       |   |               +---com
|       |   |               |   \---example
|       |   |               |       \---ohrana
|       |   |               |               ExampleUnitTest.class
|       |   |               |               
|       |   |               \---META-INF
|       |   |                       app.kotlin_module
|       |   |                       
|       |   +---manifest_merge_blame_file
|       |   |   +---debug
|       |   |   |   \---processDebugMainManifest
|       |   |   |           manifest-merger-blame-debug-report.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseMainManifest
|       |   |               manifest-merger-blame-release-report.txt
|       |   |               
|       |   +---merged_manifest
|       |   |   +---debug
|       |   |   |   \---processDebugMainManifest
|       |   |   |           AndroidManifest.xml
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseMainManifest
|       |   |               AndroidManifest.xml
|       |   |               
|       |   +---merged_manifests
|       |   |   +---debug
|       |   |   |   \---processDebugManifest
|       |   |   |           AndroidManifest.xml
|       |   |   |           output-metadata.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseManifest
|       |   |               AndroidManifest.xml
|       |   |               output-metadata.json
|       |   |               
|       |   +---packaged_manifests
|       |   |   +---debug
|       |   |   |   \---processDebugManifestForPackage
|       |   |   |           AndroidManifest.xml
|       |   |   |           output-metadata.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseManifestForPackage
|       |   |               AndroidManifest.xml
|       |   |               output-metadata.json
|       |   |               
|       |   +---merged_jni_libs
|       |   |   +---debug
|       |   |   |   \---mergeDebugJniLibFolders
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---mergeReleaseJniLibFolders
|       |   |           \---out
|       |   +---merged_native_libs
|       |   |   +---debug
|       |   |   |   \---mergeDebugNativeLibs
|       |   |   |       \---out
|       |   |   |           \---lib
|       |   |   |               +---arm64-v8a
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       
|       |   |   |               +---armeabi-v7a
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       
|       |   |   |               +---x86
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       
|       |   |   |               \---x86_64
|       |   |   |                       libimage_processing_util_jni.so
|       |   |   |                       libbarhopper_v3.so
|       |   |   |                       libmlkit_google_ocr_pipeline.so
|       |   |   |                       libandroidx.graphics.path.so
|       |   |   |                       
|       |   |   \---release
|       |   |       \---mergeReleaseNativeLibs
|       |   |           \---out
|       |   |               \---lib
|       |   |                   +---arm64-v8a
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       
|       |   |                   +---armeabi-v7a
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       
|       |   |                   +---x86
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       
|       |   |                   \---x86_64
|       |   |                           libimage_processing_util_jni.so
|       |   |                           libbarhopper_v3.so
|       |   |                           libmlkit_google_ocr_pipeline.so
|       |   |                           libandroidx.graphics.path.so
|       |   |                           
|       |   +---merged_test_only_native_libs
|       |   |   +---debug
|       |   |   |   \---mergeDebugNativeLibs
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---mergeReleaseNativeLibs
|       |   |           \---out
|       |   +---validate_signing_config
|       |   |   \---debug
|       |   |       \---validateSigningDebug
|       |   +---app_metadata
|       |   |   +---debug
|       |   |   |   \---writeDebugAppMetadata
|       |   |   |           app-metadata.properties
|       |   |   |           
|       |   |   \---release
|       |   |       \---writeReleaseAppMetadata
|       |   |               app-metadata.properties
|       |   |               
|       |   +---signing_config_versions
|       |   |   +---debug
|       |   |   |   \---writeDebugSigningConfigVersions
|       |   |   |           signing-config-versions.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---writeReleaseSigningConfigVersions
|       |   |               signing-config-versions.json
|       |   |               
|       |   +---java_res
|       |   |   +---debug
|       |   |   |   \---processDebugJavaRes
|       |   |   |       \---out
|       |   |   |           +---META-INF
|       |   |   |           |       app.kotlin_module
|       |   |   |           |       
|       |   |   |           \---com
|       |   |   |               \---example
|       |   |   |                   \---ohrana
|       |   |   |                       \---ui
|       |   |   |                           \---theme
|       |   |   +---release
|       |   |   |   \---processReleaseJavaRes
|       |   |   |       \---out
|       |   |   |           +---META-INF
|       |   |   |           |       app.kotlin_module
|       |   |   |           |       
|       |   |   |           \---com
|       |   |   |               \---example
|       |   |   |                   \---ohrana
|       |   |   |                       \---ui
|       |   |   |                           \---theme
|       |   |   \---debugUnitTest
|       |   |       \---processDebugUnitTestJavaRes
|       |   |           \---out
|       |   |               +---META-INF
|       |   |               |       app.kotlin_module
|       |   |               |       
|       |   |               \---com
|       |   |                   \---example
|       |   |                       \---ohrana
|       |   +---merged_java_res
|       |   |   +---debug
|       |   |   |   \---mergeDebugJavaResource
|       |   |   |           base.jar
|       |   |   |           
|       |   |   \---release
|       |   |       \---mergeReleaseJavaResource
|       |   |               base.jar
|       |   |               
|       |   +---compile_and_runtime_r_class_jar
|       |   |   +---debug
|       |   |   |   \---processDebugResources
|       |   |   |           R.jar
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseResources
|       |   |               R.jar
|       |   |               
|       |   +---linked_resources_binary_format
|       |   |   +---debug
|       |   |   |   \---processDebugResources
|       |   |   |           linked-resources-binary-format-debug.ap_
|       |   |   |           output-metadata.json
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseResources
|       |   |               linked-resources-binary-format-release.ap_
|       |   |               output-metadata.json
|       |   |               
|       |   +---stable_resource_ids_file
|       |   |   +---debug
|       |   |   |   \---processDebugResources
|       |   |   |           stableIds.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseResources
|       |   |               stableIds.txt
|       |   |               
|       |   +---runtime_symbol_list
|       |   |   +---debug
|       |   |   |   \---processDebugResources
|       |   |   |           R.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---processReleaseResources
|       |   |               R.txt
|       |   |               
|       |   +---external_libs_dex_archive_with_artifact_transforms
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---global_synthetics_external_libs_artifact_transform
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---external_libs_dex_archive
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---global_synthetics_external_lib
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---mixed_scope_dex_archive
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---global_synthetics_mixed_scope
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---project_dex_archive
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   |           |   058e5269dfdffdff99d4e47a64cde112eaa23f6a8805a035603b63ff1f0fd152_0.jar
|       |   |   |           |   058e5269dfdffdff99d4e47a64cde112eaa23f6a8805a035603b63ff1f0fd152_1.jar
|       |   |   |           |   
|       |   |   |           \---com
|       |   |   |               \---example
|       |   |   |                   \---ohrana
|       |   |   |                       |   ComposableSingletons$AdministratorScreenKt.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$1.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$3.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.dex
|       |   |   |                       |   CheckpointEntry.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.dex
|       |   |   |                       |   PrivetScreenKt.dex
|       |   |   |                       |   QrResult$ShiftReportTrigger.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$4.dex
|       |   |   |                       |   Employee.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.dex
|       |   |   |                       |   ComposableSingletons$EmployeeListScreenKt.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.dex
|       |   |   |                       |   OhrannikScreenKt.dex
|       |   |   |                       |   ComposableSingletons$OhrannikScreenKt.dex
|       |   |   |                       |   QrScanRecord.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.dex
|       |   |   |                       |   QrResult$QuestionFormat.dex
|       |   |   |                       |   AdministratorScreenKt.dex
|       |   |   |                       |   QrResult$InputFormat.dex
|       |   |   |                       |   QrResult.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.dex
|       |   |   |                       |   QrResult$LocationCheckpoint.dex
|       |   |   |                       |   MainActivity.dex
|       |   |   |                       |   EmployeeListScreenKt.dex
|       |   |   |                       |   QrResult$Error.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$2.dex
|       |   |   |                       |   SpisokOtchetovKt.dex
|       |   |   |                       |   ComposableSingletons$SpisokOtchetovKt.dex
|       |   |   |                       |   ComposableSingletons$PrivetScreenKt.dex
|       |   |   |                       |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.dex
|       |   |   |                       |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.dex
|       |   |   |                       |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.dex
|       |   |   |                       |   ComposableSingletons$MainActivityKt.dex
|       |   |   |                       |   QrHandler.dex
|       |   |   |                       |   MainActivityKt.dex
|       |   |   |                       |   SharedPrefsManager.dex
|       |   |   |                       |   ComposableSingletons$OhrannikCabinetScreenKt.dex
|       |   |   |                       |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.dex
|       |   |   |                       |   OhrannikCabinetScreenKt.dex
|       |   |   |                       |   
|       |   |   |                       \---ui
|       |   |   |                           \---theme
|       |   |   |                                   TypeKt.dex
|       |   |   |                                   ThemeKt.dex
|       |   |   |                                   ColorKt.dex
|       |   |   |                                   
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   |               |   9e767b1700949745d5221fd1141ba76c8a0d098764cb4002ff45a7b5af24a8dc_0.jar
|       |   |               |   9e767b1700949745d5221fd1141ba76c8a0d098764cb4002ff45a7b5af24a8dc_1.jar
|       |   |               |   
|       |   |               \---com
|       |   |                   \---example
|       |   |                       \---ohrana
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$1.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$3.dex
|       |   |                           |   ComposableSingletons$MainActivityKt.dex
|       |   |                           |   CheckpointEntry.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$1.dex
|       |   |                           |   QrResult$ShiftReportTrigger.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$3.dex
|       |   |                           |   Employee.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$1$1.dex
|       |   |                           |   ComposableSingletons$EmployeeListScreenKt.dex
|       |   |                           |   ComposableSingletons$OhrannikCabinetScreenKt.dex
|       |   |                           |   ComposableSingletons$OhrannikScreenKt.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$1$1.dex
|       |   |                           |   SharedPrefsManager.dex
|       |   |                           |   AdministratorScreenKt.dex
|       |   |                           |   QrResult.dex
|       |   |                           |   ComposableSingletons$AdministratorScreenKt.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$2$1$2$1$1$2.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1.dex
|       |   |                           |   MainActivity.dex
|       |   |                           |   QrResult$Error.dex
|       |   |                           |   QrHandler.dex
|       |   |                           |   SpisokOtchetovKt.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$2.dex
|       |   |                           |   ComposableSingletons$PrivetScreenKt.dex
|       |   |                           |   PrivetScreenKt.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$1.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$3.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$4.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$2$1$6$1$1$1$1$2$2$1.dex
|       |   |                           |   MainActivityKt.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$4.dex
|       |   |                           |   OhrannikScreenKt.dex
|       |   |                           |   QrScanRecord.dex
|       |   |                           |   QrResult$QuestionFormat.dex
|       |   |                           |   OhrannikCabinetScreenKt$OhrannikCabinetScreen$1$1.dex
|       |   |                           |   QrResult$InputFormat.dex
|       |   |                           |   EmployeeListScreenKt$EmployeeListScreen$lambda$25$lambda$24$lambda$23$lambda$22$$inlined$items$default$4.dex
|       |   |                           |   QrResult$LocationCheckpoint.dex
|       |   |                           |   EmployeeListScreenKt.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$2.dex
|       |   |                           |   ComposableSingletons$SpisokOtchetovKt.dex
|       |   |                           |   OhrannikScreenKt$OhrannikScreen$lambda$8$lambda$7$lambda$6$lambda$5$$inlined$items$default$2.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$1$1.dex
|       |   |                           |   OhrannikCabinetScreenKt.dex
|       |   |                           |   SpisokOtchetovKt$SpisokOtchetovScreen$2$1$1$1$1$2.dex
|       |   |                           |   
|       |   |                           \---ui
|       |   |                               \---theme
|       |   |                                       TypeKt.dex
|       |   |                                       ThemeKt.dex
|       |   |                                       ColorKt.dex
|       |   |                                       
|       |   +---global_synthetics_project
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---sub_project_dex_archive
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---global_synthetics_subproject
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   +---desugar_graph
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |       \---out
|       |   |   |           +---currentProject
|       |   |   |           |   +---jar_133561ecbcf55688e806a729d85a2e5b8fa33673fb11677f88c56fedd4a5cee6_bucket_0
|       |   |   |           |   |       graph.bin
|       |   |   |           |   |       
|       |   |   |           |   +---jar_133561ecbcf55688e806a729d85a2e5b8fa33673fb11677f88c56fedd4a5cee6_bucket_1
|       |   |   |           |   |       graph.bin
|       |   |   |           |   |       
|       |   |   |           |   +---dirs_bucket_1
|       |   |   |           |   |       graph.bin
|       |   |   |           |   |       
|       |   |   |           |   \---dirs_bucket_0
|       |   |   |           |           graph.bin
|       |   |   |           |           
|       |   |   |           +---otherProjects
|       |   |   |           |   +---dirs_bucket_1
|       |   |   |           |   |       graph.bin
|       |   |   |           |   |       
|       |   |   |           |   \---dirs_bucket_0
|       |   |   |           |           graph.bin
|       |   |   |           |           
|       |   |   |           +---mixedScopes
|       |   |   |           |   +---dirs_bucket_0
|       |   |   |           |   |       graph.bin
|       |   |   |           |   |       
|       |   |   |           |   \---dirs_bucket_1
|       |   |   |           |           graph.bin
|       |   |   |           |           
|       |   |   |           \---externalLibs
|       |   |   |               +---dirs_bucket_1
|       |   |   |               |       graph.bin
|       |   |   |               |       
|       |   |   |               \---dirs_bucket_0
|       |   |   |                       graph.bin
|       |   |   |                       
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |           \---out
|       |   |               +---currentProject
|       |   |               |   +---jar_f21e875bbbcbe0fde30a17c8a27d95d9306a3b205e9005852557163bdf285060_bucket_0
|       |   |               |   |       graph.bin
|       |   |               |   |       
|       |   |               |   +---jar_f21e875bbbcbe0fde30a17c8a27d95d9306a3b205e9005852557163bdf285060_bucket_1
|       |   |               |   |       graph.bin
|       |   |               |   |       
|       |   |               |   +---dirs_bucket_1
|       |   |               |   |       graph.bin
|       |   |               |   |       
|       |   |               |   \---dirs_bucket_0
|       |   |               |           graph.bin
|       |   |               |           
|       |   |               +---otherProjects
|       |   |               |   +---dirs_bucket_0
|       |   |               |   |       graph.bin
|       |   |               |   |       
|       |   |               |   \---dirs_bucket_1
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
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |           out
|       |   |   |           
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |               out
|       |   |               
|       |   +---dex_number_of_buckets_file
|       |   |   +---debug
|       |   |   |   \---dexBuilderDebug
|       |   |   |           out
|       |   |   |           
|       |   |   \---release
|       |   |       \---dexBuilderRelease
|       |   |               out
|       |   |               
|       |   +---merged_startup_profile
|       |   |   \---release
|       |   |       \---mergeReleaseStartupProfile
|       |   +---stripped_native_libs
|       |   |   +---debug
|       |   |   |   \---stripDebugDebugSymbols
|       |   |   |       \---out
|       |   |   |           \---lib
|       |   |   |               +---arm64-v8a
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       
|       |   |   |               +---armeabi-v7a
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       
|       |   |   |               +---x86
|       |   |   |               |       libandroidx.graphics.path.so
|       |   |   |               |       libbarhopper_v3.so
|       |   |   |               |       libimage_processing_util_jni.so
|       |   |   |               |       libmlkit_google_ocr_pipeline.so
|       |   |   |               |       
|       |   |   |               \---x86_64
|       |   |   |                       libandroidx.graphics.path.so
|       |   |   |                       libbarhopper_v3.so
|       |   |   |                       libimage_processing_util_jni.so
|       |   |   |                       libmlkit_google_ocr_pipeline.so
|       |   |   |                       
|       |   |   \---release
|       |   |       \---stripReleaseDebugSymbols
|       |   |           \---out
|       |   |               \---lib
|       |   |                   +---arm64-v8a
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       
|       |   |                   +---armeabi-v7a
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       
|       |   |                   +---x86
|       |   |                   |       libandroidx.graphics.path.so
|       |   |                   |       libbarhopper_v3.so
|       |   |                   |       libimage_processing_util_jni.so
|       |   |                   |       libmlkit_google_ocr_pipeline.so
|       |   |                   |       
|       |   |                   \---x86_64
|       |   |                           libandroidx.graphics.path.so
|       |   |                           libimage_processing_util_jni.so
|       |   |                           libmlkit_google_ocr_pipeline.so
|       |   |                           libbarhopper_v3.so
|       |   |                           
|       |   +---external_libs_dex
|       |   |   \---release
|       |   |       \---mergeExtDexRelease
|       |   |               classes.dex
|       |   |               classes3.dex
|       |   |               classes2.dex
|       |   |               
|       |   +---apk_ide_redirect_file
|       |   |   +---debug
|       |   |   |   \---createDebugApkListingFileRedirect
|       |   |   |           redirect.txt
|       |   |   |           
|       |   |   \---release
|       |   |       \---createReleaseApkListingFileRedirect
|       |   |               redirect.txt
|       |   |               
|       |   +---d8_metadata
|       |   |   \---release
|       |   |       \---mergeDexRelease
|       |   |               d8-metadata.dat
|       |   |               
|       |   +---native_symbol_tables
|       |   |   \---release
|       |   |       \---extractReleaseNativeSymbolTables
|       |   |           \---out
|       |   +---merged_art_profile
|       |   |   \---release
|       |   |       \---mergeReleaseArtProfile
|       |   |               baseline-prof.txt
|       |   |               
|       |   +---version_control_info_file
|       |   |   \---release
|       |   |       \---extractReleaseVersionControlInfo
|       |   |               version-control-info.textproto
|       |   |               
|       |   +---default_proguard_files
|       |   |   \---global
|       |   |           proguard-android-optimize.txt-9.2.1
|       |   |           proguard-android.txt-9.2.1
|       |   |           
|       |   +---lint_vital_report_lint_model
|       |   |   \---release
|       |   |       \---generateReleaseLintVitalReportModel
|       |   |               module.xml
|       |   |               release.xml
|       |   |               release-artifact-dependencies.xml
|       |   |               release-artifact-libraries.xml
|       |   |               
|       |   +---lint_vital_partial_results
|       |   |   \---release
|       |   |       \---lintVitalAnalyzeRelease
|       |   |           \---out
|       |   |                   lint-resources.xml
|       |   |                   
|       |   +---lint-cache
|       |   |   +---lintVitalAnalyzeRelease
|       |   |   |   |   lint-cache-version.txt
|       |   |   |   |   
|       |   |   |   +---sdk_index
|       |   |   |   |       snapshot.gz
|       |   |   |   |       
|       |   |   |   \---maven.google
|       |   |   |       |   master-index.xml
|       |   |   |       |   
|       |   |   |       +---androidx
|       |   |   |       |   +---core
|       |   |   |       |   |       group-index.xml
|       |   |   |       |   |       
|       |   |   |       |   +---test
|       |   |   |       |   |   +---ext
|       |   |   |       |   |   |       group-index.xml
|       |   |   |       |   |   |       
|       |   |   |       |   |   \---espresso
|       |   |   |       |   |           group-index.xml
|       |   |   |       |   |           
|       |   |   |       |   +---lifecycle
|       |   |   |       |   |       group-index.xml
|       |   |   |       |   |       
|       |   |   |       |   +---activity
|       |   |   |       |   |       group-index.xml
|       |   |   |       |   |       
|       |   |   |       |   +---compose
|       |   |   |       |   |   |   group-index.xml
|       |   |   |       |   |   |   
|       |   |   |       |   |   \---ui
|       |   |   |       |   |           group-index.xml
|       |   |   |       |   |           
|       |   |   |       |   +---glance
|       |   |   |       |   |       group-index.xml
|       |   |   |       |   |       
|       |   |   |       |   \---camera
|       |   |   |       |           group-index.xml
|       |   |   |       |           
|       |   |   |       \---com
|       |   |   |           +---android
|       |   |   |           |   \---application
|       |   |   |           |           group-index.xml
|       |   |   |           |           
|       |   |   |           \---google
|       |   |   |               \---mlkit
|       |   |   |                       group-index.xml
|       |   |   |                       
|       |   |   +---lintAnalyzeDebugAndroidTest
|       |   |   |       lint-cache-version.txt
|       |   |   |       
|       |   |   +---lintAnalyzeDebug
|       |   |   |   |   lint-cache-version.txt
|       |   |   |   |   api-versions-50-36.0.bin
|       |   |   |   |   typos-en.txt-2.bin
|       |   |   |   |   
|       |   |   |   +---sdk_index
|       |   |   |   |       snapshot.gz
|       |   |   |   |       
|       |   |   |   +---maven.google
|       |   |   |   |   |   master-index.xml
|       |   |   |   |   |   
|       |   |   |   |   +---androidx
|       |   |   |   |   |   +---core
|       |   |   |   |   |   |       group-index.xml
|       |   |   |   |   |   |       
|       |   |   |   |   |   +---test
|       |   |   |   |   |   |   +---ext
|       |   |   |   |   |   |   |       group-index.xml
|       |   |   |   |   |   |   |       
|       |   |   |   |   |   |   \---espresso
|       |   |   |   |   |   |           group-index.xml
|       |   |   |   |   |   |           
|       |   |   |   |   |   +---lifecycle
|       |   |   |   |   |   |       group-index.xml
|       |   |   |   |   |   |       
|       |   |   |   |   |   +---activity
|       |   |   |   |   |   |       group-index.xml
|       |   |   |   |   |   |       
|       |   |   |   |   |   +---compose
|       |   |   |   |   |   |   |   group-index.xml
|       |   |   |   |   |   |   |   
|       |   |   |   |   |   |   \---ui
|       |   |   |   |   |   |           group-index.xml
|       |   |   |   |   |   |           
|       |   |   |   |   |   +---glance
|       |   |   |   |   |   |       group-index.xml
|       |   |   |   |   |   |       
|       |   |   |   |   |   \---camera
|       |   |   |   |   |           group-index.xml
|       |   |   |   |   |           
|       |   |   |   |   \---com
|       |   |   |   |       +---android
|       |   |   |   |       |   \---application
|       |   |   |   |       |           group-index.xml
|       |   |   |   |       |           
|       |   |   |   |       \---google
|       |   |   |   |           \---mlkit
|       |   |   |   |                   group-index.xml
|       |   |   |   |                   
|       |   |   |   \---maven-versions
|       |   |   |       +---repo1.maven.org
|       |   |   |       |   +---junit
|       |   |   |       |   |   \---junit
|       |   |   |       |   |           maven-metadata.xml
|       |   |   |       |   |           
|       |   |   |       |   \---com
|       |   |   |       |       \---google
|       |   |   |       |           \---code
|       |   |   |       |               \---gson
|       |   |   |       |                   \---gson
|       |   |   |       |                           maven-metadata.xml
|       |   |   |       |                           
|       |   |   |       \---plugins.gradle.org
|       |   |   |           \---org
|       |   |   |               \---jetbrains
|       |   |   |                   \---kotlin
|       |   |   |                       \---plugin
|       |   |   |                           \---compose
|       |   |   |                               \---org.jetbrains.kotlin.plugin.compose.gradle.plugin
|       |   |   |                                       maven-metadata.xml
|       |   |   |                                       
|       |   |   \---lintAnalyzeDebugUnitTest
|       |   |           lint-cache-version.txt
|       |   |           
|       |   +---optimized_processed_res
|       |   |   \---release
|       |   |       \---optimizeReleaseResources
|       |   |               resources-release-optimize.ap_
|       |   |               output-metadata.json
|       |   |               
|       |   +---binary_art_profile
|       |   |   \---release
|       |   |       \---compileReleaseArtProfile
|       |   |               baseline.prof
|       |   |               
|       |   +---binary_art_profile_metadata
|       |   |   \---release
|       |   |       \---compileReleaseArtProfile
|       |   |               baseline.profm
|       |   |               
|       |   +---combined_art_profile
|       |   |   \---release
|       |   |       \---compileReleaseArtProfile
|       |   |               baseline-prof.txt
|       |   |               
|       |   +---dex_metadata_directory
|       |   |   \---release
|       |   |       \---compileReleaseArtProfile
|       |   |           |   dex-metadata-map.properties
|       |   |           |   
|       |   |           +---0
|       |   |           |       .dm
|       |   |           |       
|       |   |           \---1
|       |   |                   .dm
|       |   |                   
|       |   +---metadata_library_dependencies_report
|       |   |   \---release
|       |   |       \---collectReleaseDependencies
|       |   |               dependencies.pb
|       |   |               
|       |   +---sdk_dependency_data
|       |   |   \---release
|       |   |       \---sdkReleaseDependencyData
|       |   |               sdkDependencyData.pb
|       |   |               
|       |   +---compile_app_classes_jar
|       |   |   \---debug
|       |   |       \---bundleDebugClassesToCompileJar
|       |   |               classes.jar
|       |   |               
|       |   +---android_test_lint_model
|       |   |   \---debug
|       |   |       \---generateDebugAndroidTestLintModel
|       |   |               module.xml
|       |   |               debug.xml
|       |   |               debug-artifact-dependencies.xml
|       |   |               debug-artifact-libraries.xml
|       |   |               
|       |   +---lint_report_lint_model
|       |   |   \---debug
|       |   |       \---generateDebugLintReportModel
|       |   |               module.xml
|       |   |               debug.xml
|       |   |               debug-artifact-dependencies.xml
|       |   |               debug-artifact-libraries.xml
|       |   |               
|       |   +---unit_test_lint_model
|       |   |   \---debug
|       |   |       \---generateDebugUnitTestLintModel
|       |   |               module.xml
|       |   |               debug.xml
|       |   |               debug-artifact-dependencies.xml
|       |   |               debug-artifact-libraries.xml
|       |   |               
|       |   +---lint_partial_results
|       |   |   \---debug
|       |   |       \---lintAnalyzeDebug
|       |   |           \---out
|       |   |               |   lint-resources.xml
|       |   |               |   lint-definite.xml
|       |   |               |   lint-partial.xml
|       |   |               |   
|       |   |               \---ThreadConstraint
|       |   |                   \---app
|       |   |                           data
|       |   |                           data0
|       |   |                           data1
|       |   |                           
|       |   +---android_test_lint_partial_results
|       |   |   \---debug
|       |   |       \---lintAnalyzeDebugAndroidTest
|       |   |           \---out
|       |   |               |   lint-partial.xml
|       |   |               |   
|       |   |               \---ThreadConstraint
|       |   |                   \---app
|       |   |                           data
|       |   |                           data0
|       |   |                           data1
|       |   |                           
|       |   +---unit_test_lint_partial_results
|       |   |   \---debug
|       |   |       \---lintAnalyzeDebugUnitTest
|       |   |           \---out
|       |   |               |   lint-partial.xml
|       |   |               |   
|       |   |               \---ThreadConstraint
|       |   |                   \---app
|       |   |                           data
|       |   |                           data0
|       |   |                           data1
|       |   |                           
|       |   +---runtime_app_classes_jar
|       |   |   \---debug
|       |   |       \---bundleDebugClassesToRuntimeJar
|       |   |               classes.jar
|       |   |               
|       |   +---unit_test_results
|       |   |   \---debug
|       |   |       \---testDebugUnitTest
|       |   \---apk
|       |       \---debug
|       |               app-debug.apk
|       |               output-metadata.json
|       |               
|       +---generated
|       |   +---updated_navigation_xml
|       |   |   +---debug
|       |   |   \---release
|       |   \---res
|       |       \---pngs
|       |           +---debug
|       |           \---release
|       +---kotlin
|       |   +---compileDebugKotlin
|       |   |   +---classpath-snapshot
|       |   |   |       shrunk-classpath-snapshot.bin
|       |   |   |       
|       |   |   +---cacheable
|       |   |   |   |   last-build.bin
|       |   |   |   |   
|       |   |   |   \---caches-jvm
|       |   |   |       +---inputs
|       |   |   |       |       source-to-output.tab.len
|       |   |   |       |       source-to-output.tab
|       |   |   |       |       source-to-output.tab_i.len
|       |   |   |       |       source-to-output.tab.keystream.len
|       |   |   |       |       source-to-output.tab_i
|       |   |   |       |       source-to-output.tab.values.at
|       |   |   |       |       source-to-output.tab.keystream
|       |   |   |       |       
|       |   |   |       +---lookups
|       |   |   |       |       id-to-file.tab.len
|       |   |   |       |       id-to-file.tab
|       |   |   |       |       id-to-file.tab_i.len
|       |   |   |       |       id-to-file.tab.keystream.len
|       |   |   |       |       id-to-file.tab_i
|       |   |   |       |       id-to-file.tab.values.at
|       |   |   |       |       id-to-file.tab.keystream
|       |   |   |       |       file-to-id.tab.len
|       |   |   |       |       file-to-id.tab
|       |   |   |       |       file-to-id.tab_i.len
|       |   |   |       |       file-to-id.tab.keystream.len
|       |   |   |       |       file-to-id.tab_i
|       |   |   |       |       file-to-id.tab.values.at
|       |   |   |       |       file-to-id.tab.keystream
|       |   |   |       |       lookups.tab.len
|       |   |   |       |       lookups.tab
|       |   |   |       |       lookups.tab_i.len
|       |   |   |       |       lookups.tab.keystream.len
|       |   |   |       |       lookups.tab_i
|       |   |   |       |       lookups.tab.keystream
|       |   |   |       |       lookups.tab.values.at
|       |   |   |       |       counters.tab
|       |   |   |       |       
|       |   |   |       \---jvm
|       |   |   |           \---kotlin
|       |   |   |                   class-attributes.tab.len
|       |   |   |                   class-attributes.tab
|       |   |   |                   class-attributes.tab_i.len
|       |   |   |                   class-attributes.tab.keystream.len
|       |   |   |                   class-attributes.tab_i
|       |   |   |                   class-attributes.tab.values.at
|       |   |   |                   class-attributes.tab.keystream
|       |   |   |                   subtypes.tab.len
|       |   |   |                   subtypes.tab
|       |   |   |                   subtypes.tab_i.len
|       |   |   |                   subtypes.tab.keystream.len
|       |   |   |                   subtypes.tab_i
|       |   |   |                   subtypes.tab.values.at
|       |   |   |                   subtypes.tab.keystream
|       |   |   |                   supertypes.tab.len
|       |   |   |                   supertypes.tab
|       |   |   |                   supertypes.tab_i.len
|       |   |   |                   supertypes.tab.keystream.len
|       |   |   |                   supertypes.tab_i
|       |   |   |                   supertypes.tab.values.at
|       |   |   |                   supertypes.tab.keystream
|       |   |   |                   class-fq-name-to-source.tab.len
|       |   |   |                   class-fq-name-to-source.tab
|       |   |   |                   class-fq-name-to-source.tab_i.len
|       |   |   |                   class-fq-name-to-source.tab.keystream.len
|       |   |   |                   class-fq-name-to-source.tab_i
|       |   |   |                   class-fq-name-to-source.tab.values.at
|       |   |   |                   class-fq-name-to-source.tab.keystream
|       |   |   |                   source-to-classes.tab.len
|       |   |   |                   source-to-classes.tab
|       |   |   |                   source-to-classes.tab_i.len
|       |   |   |                   source-to-classes.tab.keystream.len
|       |   |   |                   source-to-classes.tab_i
|       |   |   |                   source-to-classes.tab.values.at
|       |   |   |                   source-to-classes.tab.keystream
|       |   |   |                   proto.tab.len
|       |   |   |                   proto.tab
|       |   |   |                   proto.tab_i.len
|       |   |   |                   proto.tab.keystream.len
|       |   |   |                   proto.tab_i
|       |   |   |                   proto.tab.values.at
|       |   |   |                   proto.tab.keystream
|       |   |   |                   package-parts.tab.len
|       |   |   |                   package-parts.tab
|       |   |   |                   package-parts.tab_i.len
|       |   |   |                   package-parts.tab.keystream.len
|       |   |   |                   package-parts.tab_i
|       |   |   |                   package-parts.tab.values.at
|       |   |   |                   package-parts.tab.keystream
|       |   |   |                   internal-name-to-source.tab.len
|       |   |   |                   internal-name-to-source.tab
|       |   |   |                   internal-name-to-source.tab_i.len
|       |   |   |                   internal-name-to-source.tab.keystream.len
|       |   |   |                   internal-name-to-source.tab_i
|       |   |   |                   internal-name-to-source.tab.keystream
|       |   |   |                   internal-name-to-source.tab.values.at
|       |   |   |                   
|       |   |   \---local-state
|       |   +---compileReleaseKotlin
|       |   |   +---classpath-snapshot
|       |   |   |       shrunk-classpath-snapshot.bin
|       |   |   |       
|       |   |   +---cacheable
|       |   |   |   |   last-build.bin
|       |   |   |   |   
|       |   |   |   \---caches-jvm
|       |   |   |       +---inputs
|       |   |   |       |       source-to-output.tab.len
|       |   |   |       |       source-to-output.tab
|       |   |   |       |       source-to-output.tab_i.len
|       |   |   |       |       source-to-output.tab.keystream.len
|       |   |   |       |       source-to-output.tab_i
|       |   |   |       |       source-to-output.tab.values.at
|       |   |   |       |       source-to-output.tab.keystream
|       |   |   |       |       
|       |   |   |       +---lookups
|       |   |   |       |       counters.tab
|       |   |   |       |       id-to-file.tab.len
|       |   |   |       |       id-to-file.tab
|       |   |   |       |       id-to-file.tab_i.len
|       |   |   |       |       id-to-file.tab.keystream.len
|       |   |   |       |       id-to-file.tab_i
|       |   |   |       |       id-to-file.tab.values.at
|       |   |   |       |       id-to-file.tab.keystream
|       |   |   |       |       file-to-id.tab.len
|       |   |   |       |       file-to-id.tab
|       |   |   |       |       file-to-id.tab_i.len
|       |   |   |       |       file-to-id.tab.keystream.len
|       |   |   |       |       file-to-id.tab_i
|       |   |   |       |       file-to-id.tab.values.at
|       |   |   |       |       file-to-id.tab.keystream
|       |   |   |       |       lookups.tab.len
|       |   |   |       |       lookups.tab
|       |   |   |       |       lookups.tab_i.len
|       |   |   |       |       lookups.tab.keystream.len
|       |   |   |       |       lookups.tab_i
|       |   |   |       |       lookups.tab.keystream
|       |   |   |       |       lookups.tab.values.at
|       |   |   |       |       
|       |   |   |       \---jvm
|       |   |   |           \---kotlin
|       |   |   |                   class-attributes.tab.len
|       |   |   |                   class-attributes.tab
|       |   |   |                   class-attributes.tab_i.len
|       |   |   |                   class-attributes.tab.keystream.len
|       |   |   |                   class-attributes.tab_i
|       |   |   |                   class-attributes.tab.values.at
|       |   |   |                   class-attributes.tab.keystream
|       |   |   |                   subtypes.tab.len
|       |   |   |                   subtypes.tab
|       |   |   |                   subtypes.tab_i.len
|       |   |   |                   subtypes.tab.keystream.len
|       |   |   |                   subtypes.tab_i
|       |   |   |                   subtypes.tab.values.at
|       |   |   |                   subtypes.tab.keystream
|       |   |   |                   supertypes.tab.len
|       |   |   |                   supertypes.tab
|       |   |   |                   supertypes.tab_i.len
|       |   |   |                   supertypes.tab.keystream.len
|       |   |   |                   supertypes.tab_i
|       |   |   |                   supertypes.tab.values.at
|       |   |   |                   supertypes.tab.keystream
|       |   |   |                   class-fq-name-to-source.tab.len
|       |   |   |                   class-fq-name-to-source.tab
|       |   |   |                   class-fq-name-to-source.tab_i.len
|       |   |   |                   class-fq-name-to-source.tab.keystream.len
|       |   |   |                   class-fq-name-to-source.tab_i
|       |   |   |                   class-fq-name-to-source.tab.values.at
|       |   |   |                   class-fq-name-to-source.tab.keystream
|       |   |   |                   source-to-classes.tab.len
|       |   |   |                   source-to-classes.tab
|       |   |   |                   source-to-classes.tab_i.len
|       |   |   |                   source-to-classes.tab.keystream.len
|       |   |   |                   source-to-classes.tab_i
|       |   |   |                   source-to-classes.tab.values.at
|       |   |   |                   source-to-classes.tab.keystream
|       |   |   |                   proto.tab.len
|       |   |   |                   proto.tab
|       |   |   |                   proto.tab_i.len
|       |   |   |                   proto.tab.keystream.len
|       |   |   |                   proto.tab_i
|       |   |   |                   proto.tab.values.at
|       |   |   |                   proto.tab.keystream
|       |   |   |                   package-parts.tab.len
|       |   |   |                   package-parts.tab
|       |   |   |                   package-parts.tab_i.len
|       |   |   |                   package-parts.tab.keystream.len
|       |   |   |                   package-parts.tab_i
|       |   |   |                   package-parts.tab.values.at
|       |   |   |                   package-parts.tab.keystream
|       |   |   |                   internal-name-to-source.tab.len
|       |   |   |                   internal-name-to-source.tab
|       |   |   |                   internal-name-to-source.tab_i.len
|       |   |   |                   internal-name-to-source.tab.keystream.len
|       |   |   |                   internal-name-to-source.tab_i
|       |   |   |                   internal-name-to-source.tab.keystream
|       |   |   |                   internal-name-to-source.tab.values.at
|       |   |   |                   
|       |   |   \---local-state
|       |   \---compileDebugUnitTestKotlin
|       |       +---classpath-snapshot
|       |       |       shrunk-classpath-snapshot.bin
|       |       |       
|       |       +---cacheable
|       |       |   |   last-build.bin
|       |       |   |   
|       |       |   \---caches-jvm
|       |       |       +---inputs
|       |       |       |       source-to-output.tab.len
|       |       |       |       source-to-output.tab
|       |       |       |       source-to-output.tab_i.len
|       |       |       |       source-to-output.tab.keystream.len
|       |       |       |       source-to-output.tab_i
|       |       |       |       source-to-output.tab.values.at
|       |       |       |       source-to-output.tab.keystream
|       |       |       |       
|       |       |       +---lookups
|       |       |       |       counters.tab
|       |       |       |       id-to-file.tab.len
|       |       |       |       id-to-file.tab
|       |       |       |       id-to-file.tab_i.len
|       |       |       |       id-to-file.tab.keystream.len
|       |       |       |       id-to-file.tab.values.at
|       |       |       |       id-to-file.tab.keystream
|       |       |       |       file-to-id.tab.len
|       |       |       |       file-to-id.tab
|       |       |       |       file-to-id.tab_i.len
|       |       |       |       file-to-id.tab.keystream.len
|       |       |       |       file-to-id.tab_i
|       |       |       |       file-to-id.tab.values.at
|       |       |       |       file-to-id.tab.keystream
|       |       |       |       lookups.tab.len
|       |       |       |       lookups.tab
|       |       |       |       lookups.tab_i.len
|       |       |       |       lookups.tab.keystream.len
|       |       |       |       lookups.tab_i
|       |       |       |       lookups.tab.values.at
|       |       |       |       lookups.tab.keystream
|       |       |       |       
|       |       |       \---jvm
|       |       |           \---kotlin
|       |       |                   class-attributes.tab.len
|       |       |                   class-attributes.tab
|       |       |                   class-attributes.tab_i.len
|       |       |                   class-attributes.tab.keystream.len
|       |       |                   class-attributes.tab_i
|       |       |                   class-attributes.tab.values.at
|       |       |                   class-attributes.tab.keystream
|       |       |                   class-fq-name-to-source.tab.len
|       |       |                   class-fq-name-to-source.tab
|       |       |                   class-fq-name-to-source.tab_i.len
|       |       |                   class-fq-name-to-source.tab.keystream.len
|       |       |                   class-fq-name-to-source.tab_i
|       |       |                   class-fq-name-to-source.tab.values.at
|       |       |                   class-fq-name-to-source.tab.keystream
|       |       |                   source-to-classes.tab.len
|       |       |                   source-to-classes.tab
|       |       |                   source-to-classes.tab_i.len
|       |       |                   source-to-classes.tab.keystream.len
|       |       |                   source-to-classes.tab_i
|       |       |                   source-to-classes.tab.values.at
|       |       |                   source-to-classes.tab.keystream
|       |       |                   proto.tab.len
|       |       |                   proto.tab
|       |       |                   proto.tab_i.len
|       |       |                   proto.tab.keystream.len
|       |       |                   proto.tab_i
|       |       |                   proto.tab.values.at
|       |       |                   proto.tab.keystream
|       |       |                   internal-name-to-source.tab.len
|       |       |                   internal-name-to-source.tab
|       |       |                   internal-name-to-source.tab_i.len
|       |       |                   internal-name-to-source.tab.keystream.len
|       |       |                   internal-name-to-source.tab_i
|       |       |                   internal-name-to-source.tab.values.at
|       |       |                   internal-name-to-source.tab.keystream
|       |       |                   
|       |       \---local-state
|       +---outputs
|       |   +---logs
|       |   |       manifest-merger-release-report.txt
|       |   |       manifest-merger-debug-report.txt
|       |   |       
|       |   +---apk
|       |   |   +---debug
|       |   |   |       app-debug.apk
|       |   |   |       output-metadata.json
|       |   |   |       
|       |   |   \---release
|       |   |       |   app-release-unsigned.apk
|       |   |       |   output-metadata.json
|       |   |       |   
|       |   |       \---baselineProfiles
|       |   |           +---0
|       |   |           |       app-release-unsigned.dm
|       |   |           |       
|       |   |           \---1
|       |   |                   app-release-unsigned.dm
|       |   |                   
|       |   \---sdk-dependencies
|       |       \---release
|       |               sdkDependencies.txt
|       |               
|       +---reports
|       |   +---resources_config_map_file
|       |   |   \---release
|       |   |           resources.cfg
|       |   |           
|       |   \---tests
|       |       \---testDebugUnitTest
|       |           |   index.html
|       |           |   
|       |           +---js
|       |           |       report.js
|       |           |       
|       |           \---css
|       |                   style.css
|       |                   base-style.css
|       |                   
|       +---test-results
|       |   \---testDebugUnitTest
|       |       \---binary
|       |               output-events.bin
|       |               results-generic.bin
|       |               
|       \---tmp
|           \---testDebugUnitTest
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
|       |       .strings.work.bin
|       |       .globals.work.bin
|       |       work.bin
|       |       _app.work.bin
|       |       buildfingerprint.bin
|       |       projectfingerprint.bin
|       |       entry.bin
|       |       classloaderscopes.bin
|       |       
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
|       \---127997f4-2363-4690-acba-fe44dcce46fa
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
|   |   
|   +---caches
|   |       deviceStreaming.xml
|   |       
|   \---inspectionProfiles
|           Project_Default.xml
|           
\---build
    \---reports
        +---configuration-cache
        |   +---2r4by892ng6ref8eceujwucsc
        |   |   +---dbb8lzkfiqzf8pobudfq4v0v4
        |   |   |       configuration-cache-report.html
        |   |   |       
        |   |   \---8bdm8vqjylwgao27nlww9xuao
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
        |   |   \---3qnv3x9sqwk23r4n3ja4cqlch
        |   |           configuration-cache-report.html
        |   |           
        |   \---4iz1et2agv3ungpnsujvur58k
        |       \---8pcwirx8t1oow2yhmx3lcjzi2
        |               configuration-cache-report.html
        |               
        \---problems
                problems-report.html
