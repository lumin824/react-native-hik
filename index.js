import {
  NativeModules,
  requireNativeComponent
} from 'react-native';

let { HikModule } = NativeModules;

export var info = HikModule.info;

export var Hik = requireNativeComponent('Hik');
