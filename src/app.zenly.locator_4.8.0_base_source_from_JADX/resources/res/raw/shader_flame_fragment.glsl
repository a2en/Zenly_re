precision highp float;

uniform float time;
uniform vec2 resolution;
uniform sampler2D imgParam;
uniform float appearProgression;
uniform float spiralPercentage;
uniform vec3 insideColor;
uniform vec3 outsideColor;

vec3 random3(vec3 c) {
    float j = 4096.0 * sin(dot(c, vec3(17.0, 59.4, 15.0)));
    vec3 r;
    r.z = fract(512.0 * j);
    j *= .125;
    r.x = fract(512.0 * j);
    j *= .125;
    r.y = fract(512.0 * j);
    return r - 0.5;
}

const float F3 =  0.3333333;
const float G3 =  0.1666667;

float simplex3d(vec3 p) {
    vec3 s = floor(p + dot(p, vec3(F3)));
    vec3 x = p - s + dot(s, vec3(G3));

    vec3 e = step(vec3(0.0), x - x.yzx);
    vec3 i1 = e * (1.0 - e.zxy);
    vec3 i2 = 1.0 - e.zxy * (1.0 - e);

    vec3 x1 = x - i1 + G3;
    vec3 x2 = x - i2 + 2.0 * G3;
    vec3 x3 = x - 1.0 + 3.0 * G3;

    vec4 w, d;

    w.x = dot(x, x);
    w.y = dot(x1, x1);
    w.z = dot(x2, x2);
    w.w = dot(x3, x3);

    w = max(0.6 - w, 0.0);

    d.x = dot(random3(s), x);
    d.y = dot(random3(s + i1), x1);
    d.z = dot(random3(s + i2), x2);
    d.w = dot(random3(s + 1.0), x3);

    w *= w;
    w *= w;
    d *= w;

    return dot(d, vec4(52.0));
}

const mat3 rot1 = mat3(-0.37, 0.36, 0.85,-0.14,-0.93, 0.34,0.92, 0.01,0.4);
const mat3 rot2 = mat3(-0.55,-0.39, 0.74, 0.33,-0.91,-0.24,0.77, 0.12,0.63);
const mat3 rot3 = mat3(-0.71, 0.52,-0.47,-0.08,-0.72,-0.68,-0.7,-0.45,0.56);

float simplex3d_fractal(vec3 m) {
    return 0.5333333 * simplex3d(m * rot1)
    + 0.2666667 * simplex3d(2.0 * m * rot2)
    + 0.1333333 * simplex3d(4.0 * m * rot3)
    + 0.0666667 * simplex3d(8.0 * m);
}

const float FLAMERADIUS = 0.45;
const float FLAMEBOOST = 0.1;
const float EDGEMIN = 0.025;
const float EDGEMAX = 0.8;
const float FALLOFFPOW = 5.0;
const float NOISEBIGNESS = 1.5;
const float WIDEN = 0.8;
const float WAVE = 0.25;
const float NIGHTSPEEDBONUS = 0.75;
const float PI = 3.14159265359;

vec3 spiralColor()
{
    float pc = (1. - gl_FragCoord.y / resolution.y) + time;
    float idx = mod(pc / .33, 3.);

    vec3 vertices[3];
    vertices[0] = vec3(0, 1., 1.);
    vertices[1] = vec3(.05098039206, .14117647032, .50196078336);
    vertices[2] = vec3(1., 0., .588235293);

    int idxBefore = int(idx);
    int idxAfter = int(mod(float(idxBefore + 1), 3.));
    float pcBefore = idx - float(idxBefore);

    return mix(vertices[idxBefore], vertices[idxAfter], pcBefore);
}

void main()
{
    vec3 spiralColor = spiralColor();
    vec3 inColor = mix(insideColor, spiralColor, spiralPercentage);
    vec3 outColor = mix(outsideColor, spiralColor, spiralPercentage);
    float time = 28.22 + NIGHTSPEEDBONUS * time;
    float bignessScale = 1.0 / NOISEBIGNESS;
    vec2 p = gl_FragCoord.xy / resolution.y;

    float aspect = resolution.x / resolution.y;
    vec2 positionFromCenter = p - vec2(0.5 * aspect, 0.5);
    positionFromCenter /= FLAMERADIUS;
    positionFromCenter.x /= WIDEN;
    float positionFromBottom = 0.5 * (positionFromCenter.y + 1.0);
    vec2 waveOffset = vec2(positionFromBottom * sin(4.0 * positionFromCenter.y - 4.0 * time) + 0.1 * positionFromBottom * sin(4.0 * positionFromCenter.x - 1.561 * time), 0.0);

    positionFromCenter += WAVE * waveOffset;

    positionFromCenter.x += positionFromCenter.x * positionFromBottom;


    float flameMask = clamp(1.0 - length(positionFromCenter), 0.0, 0.18);
    flameMask = 1.0 - pow(1.0 - flameMask, FALLOFFPOW);


    /* Noise: */
    vec3 p3 = bignessScale * 0.25 * vec3(p.x, p.y, 0.0) + vec3(0.0, -time * 0.1, time * 0.025);
    float noise = simplex3d(p3 * 32.0);
    noise = 0.5 + 0.5 * noise;

    vec3 finalColor;

    float alpha = 1.;
    float value = flameMask * noise;
    value += FLAMEBOOST * flameMask;

    float edge = appearProgression * mix(EDGEMIN, EDGEMAX, pow(0.5 * (positionFromCenter.y + 1.0), 1.5) ) + (1.0 - appearProgression);

    float steppedValue = smoothstep(edge, edge + 0.01, value);
    steppedValue = mix(0.5 * steppedValue, 1.0, smoothstep(1.5 * edge, 1.5 * edge + 0.01, value));
    steppedValue = mix(0.5 * steppedValue, 1.0, smoothstep(1.0 * edge, 1.0 * edge + 0.01, value));

    vec3 bgColor = vec3(0.0);
    finalColor = bgColor;
    alpha = 0.;

    if (steppedValue > 0.6) {
        float f1 = 0.7;
        float f2 = 1.0 - f1;

        vec2 coords = gl_FragCoord.xy / resolution.x;
        coords.x = (coords.x - f2 * 0.5) / f1;
        coords.y = 1.0 - (coords.y - 0.14) / f1;

        vec4 pickedColor = texture2D(imgParam, coords);
        finalColor = pickedColor.xyz;
        alpha = 1.0;

        float factor = pickedColor.a;
        if (factor > 0.0) {
            finalColor /= factor;
        }

        if (coords.x < 0.0 || coords.x > 1.0 || coords.y < 0.0 || coords.y > 1.0) {
            factor = 0.0;
        }

        finalColor = mix(inColor, finalColor, factor);
    }

    if (steppedValue < 0.6) {
        finalColor = inColor;
        alpha = 1.0;
    }

    if (steppedValue < 0.3) {
        finalColor = outColor;
        alpha = 1.0;
    }
    if (steppedValue < 0.1) {
        finalColor = vec3(0.0);
        alpha = 0.0;
    }

    gl_FragColor = vec4(finalColor, alpha);
}
