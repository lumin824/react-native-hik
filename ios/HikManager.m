#import "RCTViewManager.h"
#import <MapKit/MapKit.h>

@interface HikManager : RCTViewManager

@end

@implementation HikManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
  return [[MKMapView alloc] init];
}



@end
