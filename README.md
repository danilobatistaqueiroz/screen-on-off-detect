# you need to use npm
inpm init @capacitor/plugin@latest

```
  npx: installed 26 in 8.246s
  ✔ What should be the npm package of your plugin?
  … ScreenOffDetect
  ✔ What directory should be used for your plugin?
  … ScreenOffDetect
  ✔ What should be the Package ID for your plugin?

      Package IDs are unique identifiers used in apps and plugins. For plugins,
      they're used as a Java namespace. They must be in reverse domain name
      notation, generally representing a domain name that you or your company owns.

  … br.labs.screenoffdetect
  ✔ What should be the class name for your plugin?
  … ScreenOffDetectPlugin
  ✔ What is the repository URL for your plugin?
  … https://github.com/danilobatistaqueiroz/screen-off-detect-plugin
  ✔ (optional) Who is the author of this plugin?
  … Danilo Batista de Queiroz
  ✔ What license should be used for your plugin?
  › MIT
  ✔ Enter a short description of plugin features.
  … list the ScreenOffDetect in the device
  Installing dependencies. Please wait...
```


# ScreenOffDetect

Detect screen off detect event in the device

## Install

```bash
pnpm build
pnpm install screenoffdetect
npx cap sync
```

## API

<docgen-index>

* [`addListener('screenOnOff', ...)`](#addlistenerscreenonoff)
* [Interfaces](#interfaces)
* [Type Aliases](#type-aliases)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addListener('screenOnOff', ...)

```typescript
addListener(eventName: 'screenOnOff', listener: OnOffListener) => any
```

| Param           | Type                                                    |
| --------------- | ------------------------------------------------------- |
| **`eventName`** | <code>'screenOnOff'</code>                              |
| **`listener`**  | <code><a href="#onofflistener">OnOffListener</a></code> |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### ScreenOnOffState

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>string</code> |


#### PluginListenerHandle

| Prop         | Type                      |
| ------------ | ------------------------- |
| **`remove`** | <code>() =&gt; any</code> |


### Type Aliases


#### OnOffListener

<code>(state: <a href="#screenonoffstate">ScreenOnOffState</a>): void</code>

</docgen-api>
