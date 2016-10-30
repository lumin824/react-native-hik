
#import "RCTBridgeModule.h"
#import "RCTUIManager.h"

#import <sys/utsname.h>

@interface HikModule: NSObject<RCTBridgeModule>

@end

@implementation HikModule

- (instancetype) init{
    self = [super init];

    return self;
}

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(info:(RCTPromiseResolveBlock)resolve
                  reject:(RCTPromiseRejectBlock)reject) {
    NSMutableDictionary* result = [[NSMutableDictionary alloc]init];

    struct utsname systemInfo;
    uname(&systemInfo);

    result[@"machine"] = [NSString stringWithCString:systemInfo.machine encoding:NSUTF8StringEncoding];
    resolve(result);
}

@end
