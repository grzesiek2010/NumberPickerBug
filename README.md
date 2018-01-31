# NumberPickerBug

The problem has been discovered and reported in ODK Collect: https://github.com/opendatakit/collect/issues/1782
Wrong first value is visible if a range of the NumberPicker is:

1 - 10 then 10 is displayed instead of 1

1 - 11 then 11 is displayed instead of 1

1 - 12 then 12 is displayed instead of 1 etc

2 - 20 then 20 is displayed instead of 1 etc

The problem is visible on Android 6, 7, 8. Everything looks well on Android 4 and 5. It might be related to the setDisplayedValues() method.

![Alt Text](https://github.com/grzesiek2010/NumberPickerBug/blob/master/docs/numberPickerBug.gif)

