# app-mars-property-trading-001 (no_styles_branch)

Можно не выносить атрибуты в отдельный стиль а определять непосредственно в layout-e. В данном случае
речь идет о layout-e "property_item.xml". Такие атрибуты как layout_margin-ы будут определены в списке
атрибутов самого TextView "property_text". Таким же образом определяются цвет background-а для элемента
списка и размер шрифта.
 Все-таки, IMHO, удобнее выносить настройку элементов layout-ов в отдельные стили так как это сделано в основной ветке проекта master. В этом случае стиль может быть переиспользован для
нескольких View. Даже с точки зрения переиспользования любое изменение в самом стиле применится к ним всем.

Варианты использования аттрибута textAppearance:

android:textAppearance="?android:textAppearanceSmall" => 14sp
android:textAppearance="?android:textAppearanceMedium" => 18sp
android:textAppearance="?android:textAppearanceLarge" => 22sp
